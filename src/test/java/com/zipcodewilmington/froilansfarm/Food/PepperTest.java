package com.zipcodewilmington.froilansfarm.Food;

import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public class PepperTest {
    @Test
    public void testConstruction() {
        Pepper pepper = new Pepper();
        int expected = StaminaValue.PEPPER.asInteger();
        int actual = pepper.getStaminaValue();

        Assert.assertEquals(expected, actual);
    }
}