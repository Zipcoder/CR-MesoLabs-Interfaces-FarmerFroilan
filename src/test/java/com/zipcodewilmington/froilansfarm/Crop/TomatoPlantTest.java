package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Food.Tomato;
import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public class TomatoPlantTest {
    @Test
    public void testYieldTomato() {
        Tomato tomato = new Tomato();
        TomatoPlant plant = new TomatoPlant();

        Assert.assertEquals(tomato.getClass(), plant.yield().getClass());
    }
}