package com.zipcodewilmington.froilansfarm.vehiclestest;

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

        Assert.assertTrue(cropDuster instanceof Vehicle);

    }
    @Test
    public void rideTest(){
        CropDuster cropDuster = new CropDuster();

        Assert.assertTrue(cropDuster instanceof Vehicle);

    }
    @Test
    public void stopRidingTest(){
        CropDuster cropDuster = new CropDuster();

        Assert.assertTrue(cropDuster instanceof Vehicle);

    }
}
