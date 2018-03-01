package com.zipcodewilmington.froilansfarm.vehicleTest;

import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Field;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {
    Tractor testTractor = new Tractor();

    @Test
    public void makeNoiseTest(){
        String expected =  "Vrrrrrr";
        String actual = testTractor.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHasRiderTest(){
        testTractor.ride();
        boolean actual = testTractor.getHasRider();
        Assert.assertTrue(actual);
    }

    @Test
    public void operateTest(){
        for (int i =0; i < 5; i++){
            Field.getCropRowsInField()[0].getCropsInRow().add(new CornStalk());
        }
        for (int i =0; i < 5; i++){
            Field.getCropRowsInField()[0].getCropsInRow().get(i).setHasBeenFertilized(true);
        }
        testTractor.ride();
        testTractor.operate();
        boolean actual = Field.getCropRowsInField()[0].getCropsInRow().get(4).getHasBeenHarvested();
        Assert.assertTrue(actual);
    }
}
