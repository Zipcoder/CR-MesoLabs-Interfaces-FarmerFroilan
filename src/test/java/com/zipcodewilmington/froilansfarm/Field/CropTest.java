package com.zipcodewilmington.froilansfarm.Field;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropTest {

    @Test
    public void HasBeenFertilizedTest(){
        //Given
        Crop cropTest = new TomatoPlant();
        cropTest.setHasBeenFertilized(true);

        //When
        boolean expected = true;
        boolean actual = cropTest.getHasBeenFertilized();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HasBeenHarvestedTest(){
        //Given
        Crop cropTest = new TomatoPlant();
        cropTest.setHasBeenHarvested(true);

        //When
        boolean expected = true;
        boolean actual = cropTest.getHasBeenHarvested();

        //Then
        Assert.assertEquals(expected, actual);
    }
}