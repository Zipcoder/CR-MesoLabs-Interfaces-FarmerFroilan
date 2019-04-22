package com.zipcodewilmington.froilansfarm.farm.things.vehicles;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void makeNoiseTest(){
        //Given
        Tractor badLenny = new Tractor("Bad Lenny");

        //When
        String expected = "baRUMPBUMPbumpbumpBUMPBUMP!!!";
        String actual = badLenny.makeNoise();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void harvestCropTest(){
        //Given
        Tractor badLenny = new Tractor("Bad Lenny");
        CropRow row = new CropRow(new TomatoPlant(), new TomatoPlant(), new TomatoPlant());
        WareHouse testHouse = new WareHouse();

        //When
        badLenny.fertilize(row);
        badLenny.harvestCrop(row,testHouse);
        int expected = 3;
        int actual = testHouse.getStorageSize();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void operateTest(){
        //Given
        Tractor badLenny = new Tractor("Bad Lenny");
        Farm froilandia = new Farm(true);


        //When
        badLenny.operate(froilandia);

        //Then
        Assert.assertTrue(froilandia.getVehicles().contains(badLenny));
    }

    @Test
    public void shutDownTest(){
        //Given
        Tractor badLenny = new Tractor("Bad Lenny");
        Farm froilandia = new Farm(true);
        badLenny.operate(froilandia);

        //When
        badLenny.shutDown(froilandia);

        //Then
        Assert.assertFalse(froilandia.getVehicles().contains(badLenny));
    }

    @Test
    public void fertilzeTest(){
        //Given
        Tractor badLenny = new Tractor("Bad Lenny");
        CropRow row = new CropRow(new CornStalk(), new CornStalk(), new CornStalk());

        //When
        badLenny.fertilize(row);

        //Then
        Assert.assertTrue(row.getCrop(0).isFertilized());
        Assert.assertTrue(row.getCrop(1).isFertilized());
        Assert.assertTrue(row.getCrop(2).isFertilized());
    }


}
