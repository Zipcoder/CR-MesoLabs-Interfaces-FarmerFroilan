package com.zipcodewilmington.froilansfarm.crops;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCornStalk {

    @Test
    public void testToString() {
        //Given
        String toString = new String("Corn Stalk");
        //When
        String expected = ("Corn Stalk");
        String actual = toString;
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void isFertilized() {
        CornStalk Corn = new CornStalk();

        Assert.assertFalse(Corn.isFertilized());

        Corn.fertilizeCrop();

        Corn.isFertilized();

        Assert.assertTrue(Corn.isFertilized());
    }

    @Test
    public void isHarvested() {
        CornStalk Corn = new CornStalk();
        Corn.harvestCrop();
        Corn.yield();
        Assert.assertTrue(Corn.isHarvested());
    }

    @Test
    public void yield() {
    }

}