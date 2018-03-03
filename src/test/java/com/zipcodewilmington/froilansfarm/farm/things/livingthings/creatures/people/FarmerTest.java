package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.buildings.Stable;
import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Chicken;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Horse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.ChickenFeed;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Egg;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Hay;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmerTest {

    Farmer froilan;
    CornStalk stalky;
    CornStalk stalker;
    Horse shadowfax;
    CropRow row1;

    @Before
    public void setup(){
        froilan = new Farmer("Froiland");
        stalky = new CornStalk();
        stalker = new CornStalk();
        shadowfax = new Horse("Shadowfax");
        row1 = new CropRow();

    }

    @Test
    public void makeNoiseTest(){
        //Given
        //Farmer froilan

        //When
        String expected = "E I E I O";
        String actual = froilan.makeNoise();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void plantTest(){
        //Given
        //Farmer froilan

        //When
        froilan.plant(stalky, row1);
        Crop expected = stalky;
        Crop actual = row1.getCrop(0);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void plantMultipleTest(){
        //Given
        //Farmer froilan

        //When
        froilan.plant(stalky, row1);
        froilan.plant(stalker, row1);

        Crop[] expected = {stalky,stalker};
        Crop[] actual = row1.getAllCrops().toArray(new Crop[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);

    }

    @Test
    public void mountTest(){
        //Given
        //Farmer froilan

        //When
        froilan.mount(shadowfax);

        //Then
        Assert.assertTrue(shadowfax.isBeingRidden());
    }

    @Test
    public void dismountTest(){
        //Given
        //Farmer froilan

        //When
        froilan.mount(shadowfax);
        froilan.dismount(shadowfax);

        //Then
        Assert.assertFalse(shadowfax.isBeingRidden());
    }

    @Test
    public void harvestEggTest(){
        //Given
        Chicken larry = new Chicken();

        //WHen

        //Then
        Assert.assertTrue(froilan.harvestEgg(larry) instanceof Egg);
    }

    @Test
    public void collectEggsTest(){
        //Given
        WareHouse house = new WareHouse();
        Chicken larry = new Chicken();
        Chicken steve = new Chicken();
        Chicken lenny = new Chicken();
        ChickenCoop test = new ChickenCoop(larry,steve,lenny);

        //When
        lenny.fertilize();
        froilan.collectEggs(test,house);
        int expected = 2;
        int actual = house.getStorageSize();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void feedChickensTest(){
        //Given
        WareHouse house = new WareHouse(new ChickenFeed(), new ChickenFeed(), new ChickenFeed());
        ChickenCoop coop = new ChickenCoop(new Chicken(), new Chicken());

        //When
        froilan.feedChickens(coop,house);

        //Then
        Assert.assertTrue(coop.getChicken(0).hasBeenFed());
        Assert.assertTrue(house.getStorageSize() == 1);
    }

    @Test
    public void feedHorsesTest(){
        //Given
        WareHouse house = new WareHouse(new Hay(), new Hay(), new Hay(), new Hay());
        Stable stable = new Stable(new Horse(""), new Horse(""), new Horse(""), new Horse(""));

        //When
        froilan.feedHorses(stable,house);

        //Then
        Assert.assertTrue(stable.getHorse(0).hasBeenFed());
        Assert.assertTrue(stable.getHorse(3).hasBeenFed());
        Assert.assertTrue(house.getStorageSize() == 0);
    }



}
