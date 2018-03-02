package com.zipcodewilmington.froilansfarm.Food;

import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public class EggTest {
    @Test
    public void testStaminaValue() {
        Egg egg = new Egg();
        int expected = egg.getStaminaValue();
        int actual = StaminaValue.EGG.asInteger();

        Assert.assertEquals(expected, actual);
    }
}