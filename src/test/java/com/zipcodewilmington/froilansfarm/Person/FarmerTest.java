package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.WatermelonPlant;
import com.zipcodewilmington.froilansfarm.Edibles.Watermelon;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmerTest {

    Farmer testFarmer;

    @Before
    public void setUp(){
        testFarmer = new Farmer();
    }

    @Test
    public void noiseTest(){
        String expected = "Hi, I'm a farmer";
        String actual = testFarmer.makeNoise();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void dismountTest(){
        Tractor testTractor = new Tractor();
        testFarmer.dismount(testTractor);
        boolean actual = testTractor.getHasRider();
        Assert.assertFalse(actual);
    }
    @Test
    public void mountTest(){
        Tractor testTractor = new Tractor();
        testFarmer.mount(testTractor);
        boolean actual = testTractor.getHasRider();
        Assert.assertTrue(actual);
    }
    @Test
    public void plantTest(){
        WatermelonPlant testWatermelonP = new WatermelonPlant();
        CropRow testCropRow = new CropRow(testWatermelonP);
        testFarmer.plantCrop(testCropRow, testWatermelonP);
        int expected = 1;
        int actual = testCropRow.getCropsInRow().size();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eatTest(){
        Watermelon testWatermelon = new Watermelon();
        testFarmer.eat(testWatermelon);
        int actual = testFarmer.getFoodFed().size();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}
