package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TomatoPlantTest {

    TomatoPlant tomatoPlant;

    @Before
    public void setup() {
        tomatoPlant = new TomatoPlant();
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(tomatoPlant instanceof Crop);
    }

    @Test
    public void yieldTest() {
        tomatoPlant.hasBeenHarvested = true;
        tomatoPlant.hasBeenFertilized = true;

        Class expected = Tomato.class;
        Class actual = tomatoPlant.yield().getClass();

        Assert.assertEquals(expected, actual);
    }
}