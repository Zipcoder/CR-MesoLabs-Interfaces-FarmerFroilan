package com.zipcodewilmington.froilansfarm.personTest;

import com.zipcodewilmington.froilansfarm.animal.Egg;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;
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
        Farm testFarm = new Farm();
        farmerTest.harvestEggs(testFarm.getChickenCoops());
        int expected = 15;
        int actualy = farmerTest.getEggHarvest().size();
        Assert.assertEquals(expected, actualy);
    }

    @Test
    public void tractorTest(){
        Farm testFarm = new Farm();
        Farmer testFarmer = new Farmer();
        testFarmer.harvestEggs(testFarm.getChickenCoops());
        testFarmer.depositEggs(testFarm.getFoodSilo());
        int expected = 15;
        int actual = testFarm.getFoodSilo().getEggStorage().size();
        Assert.assertEquals(expected, actual);

    }

}
