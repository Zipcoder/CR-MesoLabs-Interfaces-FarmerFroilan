package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTomatoPlant {

    @Test
    public void TestfertilizeCrop() {
        //Given
        String toString = new String("Tomato Plant");
        //When
        String expected = ("Tomato Plant");
        String actual = toString;
        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void TestisFertilized() {

        TomatoPlant Tomato = new TomatoPlant();

        Assert.assertFalse(Tomato.isFertilized());

        Tomato.fertilizeCrop();

        Tomato.isFertilized();

        Assert.assertTrue(Tomato.isFertilized());
    }

    @Test
    public void TestisHarvested() {
        TomatoPlant Tomato = new TomatoPlant();
        Tomato.harvestCrop();
        Tomato.yield();
        Assert.assertTrue(Tomato.isHarvested());
    }
}