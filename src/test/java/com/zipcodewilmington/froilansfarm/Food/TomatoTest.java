package com.zipcodewilmington.froilansfarm.Food;

import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public class TomatoTest {
    @Test
    public void testConstruction() {
        Tomato tomato = new Tomato();
        int expected = StaminaValue.TOMATO.asInteger();
        int actual = tomato.getStaminaValue();

        Assert.assertEquals(expected, actual);
    }
}