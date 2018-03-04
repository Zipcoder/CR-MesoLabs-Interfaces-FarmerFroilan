package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Crops.WatermelonPlant;
import com.zipcodewilmington.froilansfarm.FarmBuildings.Field;
import com.zipcodewilmington.froilansfarm.FarmBuildings.Refrigerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class TractorTest {

    Tractor testTractor;

    @Before
    public void setUp(){
        testTractor = new Tractor();
    }
    @Test
    public void testNoise(){
        String actual = testTractor.makeNoise();
        String expected = "Chuga chuga";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void rideTest(){
        testTractor.canRide();
        boolean expected = true;
        boolean actual = testTractor.getHasRider();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void stopRideTest(){
        testTractor.canRide();
        testTractor.stopRide();
        boolean actual = testTractor.getHasRider();
        Assert.assertFalse(actual);
    }
    @Test
    public void operateTest(){

        CropRow cornRow = new CropRow(new CornStalk());
        CropRow tomatoRow = new CropRow(new TomatoPlant());
        CropRow waterMelonRow = new CropRow(new WatermelonPlant());
        Field testField = new Field(cornRow, tomatoRow, waterMelonRow);
        CropDuster testDuster = new CropDuster();
        testDuster.fly();
        testDuster.operate(testField);
        testTractor.canRide();
        testTractor.operate(testField);
        int actual = testTractor.getHarvestedFood().size();
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
}
