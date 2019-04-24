package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropRowTest {

    CropRow testCropRow;

    @Before
    public void setUp(){
        CornStalk testCorn = new CornStalk();
        testCropRow = new CropRow(testCorn);
    }

    @Test
    public void testCropRow(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        testCropRow.getCropsInRow().add(tomatoPlant);
        int expected = 1;
        int actual = testCropRow.getCropsInRow().size();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCropRow2(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        WatermelonPlant watermelonPlant = new WatermelonPlant();
        testCropRow.getCropsInRow().add(tomatoPlant);
        testCropRow.getCropsInRow().add(watermelonPlant);
        int expected = 2;
        int actual = testCropRow.getCropsInRow().size();
        Assert.assertEquals(expected, actual);
    }

}
