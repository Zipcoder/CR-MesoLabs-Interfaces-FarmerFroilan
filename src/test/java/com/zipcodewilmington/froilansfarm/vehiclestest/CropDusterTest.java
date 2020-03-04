package com.zipcodewilmington.froilansfarm.vehiclestest;

import com.zipcodewilmington.froilansfarm.farmland.Field;
import com.zipcodewilmington.froilansfarm.vehicles.*;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {

    @Test
    public void instanceOfVehicleTest(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Vehicle);
        Assert.assertTrue(cropDuster instanceof FarmVehicle);
        Assert.assertTrue(cropDuster instanceof Aircraft);
    }

    @Test
    public void makeNoiseTest(){
        CropDuster cropDuster = new CropDuster();
        String expected = "putt putt putt putt";
        String actual = cropDuster.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void operateTest(){
        CropDuster cropDuster = new CropDuster();
        Field field = new Field();


        Assert.assertTrue(true);

    }
    @Test
    public void rideTest(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster.ride());

    }

    @Test
    public void stopRidingTest(){
        CropDuster cropDuster = new CropDuster();
        cropDuster.ride();
        Assert.assertTrue(cropDuster.stopRiding());
    }

    @Test
    public void flyTest(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster.fly());
    }

    @Test
    public void stopFlyingTest(){
        CropDuster cropDuster = new CropDuster();
        cropDuster.fly();
        Assert.assertFalse(cropDuster.fly());
    }
}
