package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.CropType;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Hay;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class FarmTest {

    @Test
    public void populateCropRowTest(){
        //Given
        CropRow row1;

        //When
        row1 = new CropRow(Farm.populateCropRow(CropType.CORN_STALK, 100));

        //Then
        Assert.assertTrue(row1.getCrop(55) instanceof CornStalk);
        Assert.assertTrue(row1.getRowSize() == 100);

    }

    @Test
    public void addVehicleTest(){
        //Given
        Farm froilandia = new Farm(true);
        CropDuster badLarry = new CropDuster("Bad Larry");

        //When
        froilandia.addVehicle(badLarry);

        //Then
        Assert.assertTrue(froilandia.getVehicles().contains(badLarry));

    }

    @Test
    public void removeVehicleTest(){
        //Given
        Farm froilandia = new Farm(true);
        CropDuster badLarry = new CropDuster("Bad Larry");

        //When
        froilandia.addVehicle(badLarry);
        froilandia.removeVehicle(badLarry);

        //Then
        Assert.assertFalse(froilandia.getVehicles().contains(badLarry));

    }

    @Test
    public void newFarmGetSpecificHorseTest(){
        //Given
        Farm froilandia = new Farm();

        //When
        String expected = "Shadowfax";
        String actual = froilandia.getStables().get(2).getHorse(0).getName();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void newFarmGetSpecificCropTest(){
        //Given
        Farm froilandia = new Farm();

        //When

        //Then
        Assert.assertTrue(froilandia.getField().getRow(0).getCrop(72) instanceof CornStalk);

    }

    @Test
    public void newFarmGetSpecificChickenTest(){
        //Given
        Farm froilandia = new Farm();

        //When
        String expected = "Steve";
        String actual = froilandia.getChickenCoops().get(0).getChicken(0).getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void newFarmGetPersonTest(){
        //Given
        Farm froilandia = new Farm();

        //When
        String expected = "Froilan";
        String actual = froilandia.getFarmHouse().getPerson("Froilan").getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void newFarmGetEdibleTest(){
        //Given
        Farm froilandia = new Farm();

        //When


        //Then
        Assert.assertTrue(froilandia.getWareHouse().getEdible(0) instanceof Hay);
    }

    @Test
    public void populateWareHouseTest(){
        //Given


        //When
        int expected = 500;
        int actual = Farm.populateWareHouse().size();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void nightFallTest(){
        //Given
        Farm froilandia = new Farm();

        //When
        Farmer froilan = (Farmer) froilandia.getFarmHouse().getPerson("Froilan");
        froilan.exerciseHorses(froilandia.getStables().get(0));
        froilan.feedHorses(froilandia.getStables().get(0), froilandia.getWareHouse());
        froilandia.nightFall();

        //Then
        Assert.assertFalse(froilandia.getStables().get(0).getHorse(0).wasExercised());
        Assert.assertFalse(froilandia.getStables().get(0).getHorse(0).hasBeenFed());

    }

}
