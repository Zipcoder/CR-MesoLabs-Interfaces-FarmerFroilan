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
        for (int i = 0; i < 5; i++){
            Field.getCropRowsInField()[0].getCropsInRow().add(new CornStalk());
        }
        testCropDuster.ride();
        testCropDuster.fly();
        testCropDuster.operate();
        boolean actual = Field.getCropRowsInField()[0].getCropsInRow().get(4).getHasBeenFertilized();
        Assert.assertTrue(actual);
    }
}
