package com.zipcodewilmington.froilansfarm.Vehicles;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropDusterTest {
CropDuster cropDuster=new CropDuster();
    @Test
    public void isFarmVehicle() {
        Assert.assertTrue(cropDuster.isFarmVehicle());
    }

    @Test
    public void canFly() {
        Assert.assertTrue(cropDuster.canFly());
    }

    @Test
    public void makesNoise() {
        Assert.assertTrue(cropDuster.makesNoise());
    }

    @Test
    public void operate() {
        Assert.assertTrue(cropDuster.operate());
    }

    @Test
    public void fertilize() {

    }

//    @Test
//    public boolean fertilized() {
//        Assert.assertTrue(cropDuster.fertilized(CropRow<CucumberPlant> cropRow));
//    }
}