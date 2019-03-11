package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {

    @Test
    public void testHasBeenFertilizedDefault(){
        //Given
        CropRow cr = new CropRow();

        //Then
        Assert.assertFalse(cr.getHasFertilized());
    }

    @Test
    public void testSetHasBeenFertilized(){
        //Given
        CropRow cr = new CropRow();

        //When
        cr.setHasFertilized(true);

        //Then
        Assert.assertTrue(cr.getHasFertilized());

    }
}
