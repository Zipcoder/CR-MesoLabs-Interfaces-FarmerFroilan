package com.zipcodewilmington.froilansfarm.vehicleTest;

import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Field;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {

    CropDuster testCropDuster = new CropDuster();

    @Test
    public void makeNoiseTest(){
        String expected = "Whoosh!";
        String actual = testCropDuster.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void operateTest(){
        Field testField = new Field();
        for (int i = 0; i < 5; i++){
            testField.getCropRowsInField()[0].getCropsInRow().add(new CornStalk());
        }
        testCropDuster.ride();
        testCropDuster.fly();
        testCropDuster.operate(testField);
        boolean actual = testField.getCropRowsInField()[0].getCropsInRow().get(4).getHasBeenFertilized();
        Assert.assertTrue(actual);
    }

    @Test
    public void getHasRiderTest(){
        testCropDuster.ride();
        boolean actual = testCropDuster.getHasRider();
        Assert.assertTrue(actual);
    }

    @Test
    public void getIsFlyingTest(){
        testCropDuster.ride();
        testCropDuster.fly();
        boolean actual = testCropDuster.getIsFlying();
        Assert.assertTrue(actual);
    }
}
