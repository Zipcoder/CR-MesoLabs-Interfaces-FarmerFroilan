package com.zipcodewilmington.froilansfarm.personTest;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Egg;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.CropRow;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Silo;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    Farmer farmerTest = new Farmer();

    @Test
    public void makeNoiseTest(){
        String expected = "I am making noise!";
        String actual = farmerTest.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mountTest(){
        Tractor textTractor = new Tractor();
        farmerTest.mount(textTractor);
        boolean actual = textTractor.getHasRider();
        Assert.assertTrue(actual);
    }

    @Test
    public void plantTest(){
        CropRow testCropRow = new CropRow();
        CornStalk testCornStalk = new CornStalk();
        farmerTest.plant(testCropRow, testCornStalk);
        int expected = 25;
        int actual = testCropRow.getCropsInRow().size();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void eatTest(){
        Egg testEgg = new Egg();
        farmerTest.eat(testEgg);
        int expected = 1;
        int actual = farmerTest.getFoodEaten().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestEggsTest(){
        ChickenCoop testChickenCoop = new ChickenCoop();
        for (int i =0 ; i < 15; i++){
            testChickenCoop.getChickensInCoop().add(new Chicken());
        }
        ChickenCoop[] testChickenCoopArray = new ChickenCoop[1];
        testChickenCoopArray[0] = testChickenCoop;
        farmerTest.harvestEggs(testChickenCoopArray);
        int expected = 15;
        int actualy = farmerTest.getEggHarvest().size();
        Assert.assertEquals(expected, actualy);
    }

    @Test
    public void despostEggsTest(){
        Farmer testFarmer = new Farmer();
        ChickenCoop testChickenCoop = new ChickenCoop();
        for (int i =0 ; i < 15; i++){
            testChickenCoop.getChickensInCoop().add(new Chicken());
        }
        ChickenCoop[] testChickenCoopArray = new ChickenCoop[1];
        testChickenCoopArray[0] = testChickenCoop;
        testFarmer.harvestEggs(testChickenCoopArray);
        Silo testSilo = new Silo();
        testFarmer.depositEggs(testSilo);
        int expected = 15;
        int actual = testSilo.getEggStorage().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void startOfDayResetTest(){
        farmerTest.eat(new Egg());
        farmerTest.startOfDayReset();
        int expected = 0;
        int actual = farmerTest.getFoodEaten().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        String expected = "Froilan";
        String actual = farmerTest.getName();
        Assert.assertEquals(expected, actual);
    }

}
