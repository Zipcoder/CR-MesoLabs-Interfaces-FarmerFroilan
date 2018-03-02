package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropRowTest {

    CropRow testCropRow;

    @Before
    public void setUp(){
        testCropRow = new CropRow();
    }

    @Test
    public void testCropRow(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        testCropRow.getCropRow().add(tomatoPlant);
        int expected = 1;
        int actual = testCropRow.getCropRow().size();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCropRow2(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        WatermelonPlant watermelonPlant = new WatermelonPlant();
        testCropRow.getCropRow().add(tomatoPlant);
        testCropRow.getCropRow().add(watermelonPlant);
        int expected = 2;
        int actual = testCropRow.getCropRow().size();
        Assert.assertEquals(expected, actual);
    }

}
