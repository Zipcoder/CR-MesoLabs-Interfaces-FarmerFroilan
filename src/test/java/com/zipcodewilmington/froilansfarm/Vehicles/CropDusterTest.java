package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.WatermelonPlant;
import com.zipcodewilmington.froilansfarm.FarmBuildings.Field;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropDusterTest {
    CropDuster testDuster;

    @Before
    public void setUp(){
        testDuster = new CropDuster();
    }
    @Test
    public void testNoise(){
        String actual = testDuster.makeNoise();
        String expected = "Whoosh!";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void flyTest(){
        testDuster.canRide();
        boolean actual = testDuster.getHasRider();
        Assert.assertTrue(actual);
    }
    @Test
    public void landTest(){
        testDuster.stopRide();
        boolean actual = testDuster.getHasRider();
        Assert.assertFalse(actual);
    }
    @Test
    public void operateTest(){
        WatermelonPlant waterP = new WatermelonPlant();
        CropRow testRow = new CropRow(waterP);
        Field testField = new Field(testRow);
        testDuster.fly();
        testDuster.operate(testField);
        boolean actual = testField.getCropRow(0).getCrops().isHasBeenFertilized();
        Assert.assertTrue(actual);

    }
}
