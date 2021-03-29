package com.zipcodewilmington.froilansfarm.crops;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class BroccoliPlantTest {

    @Test
    public void BroccoliPlantTest() {
        //Given
        String toString = new String("Broccoli Plant");
        //When
        String expected = ("Broccoli Plant");
        String actual = toString;
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isFertilized() {
        BroccoliPlant Broccoli = new BroccoliPlant();

        Assert.assertFalse(Broccoli.isFertilized());

        Broccoli.fertilizeCrop();

        Broccoli.isFertilized();

        Assert.assertTrue(Broccoli.isFertilized());
    }

    @Test
    public void isHarvested() {
        BroccoliPlant Broccoli = new BroccoliPlant();
        Broccoli.harvestCrop();
        Broccoli.yield();
        Assert.assertTrue(Broccoli.isHarvested());

    }

    @Test
    public void yield() {
    }
}