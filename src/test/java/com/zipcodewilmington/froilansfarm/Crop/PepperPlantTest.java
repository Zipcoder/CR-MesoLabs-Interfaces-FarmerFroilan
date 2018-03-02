package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Food.Pepper;
import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public class PepperPlantTest {
    @Test
    public void testYieldPepper() {
        Pepper pepper = new Pepper();
        PepperPlant plant = new PepperPlant();
        Assert.assertEquals(pepper.getClass(), plant.yield().getClass());
    }
}