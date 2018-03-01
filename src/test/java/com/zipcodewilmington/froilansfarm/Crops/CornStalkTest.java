package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CornStalkTest {

    CornStalk cornStalk;

    @Before
    public void setup() {
        cornStalk = new CornStalk();
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(cornStalk instanceof Crop);
    }

    @Test
    public void yieldTest() {
        cornStalk.hasBeenHarvested = true;
        cornStalk.hasBeenFertilized = true;

        Class expected = EarCorn.class;
        Class actual = cornStalk.yield().getClass();

        Assert.assertEquals(expected, actual);
    }
}

