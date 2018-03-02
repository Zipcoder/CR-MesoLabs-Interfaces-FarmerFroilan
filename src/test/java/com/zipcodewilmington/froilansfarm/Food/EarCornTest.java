package com.zipcodewilmington.froilansfarm.Food;

import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public class EarCornTest {
    @Test
    public void testConstruction() {
        EarCorn earCorn = new EarCorn();
        int expected = StaminaValue.EARCORN.asInteger();
        int actual = earCorn.getStaminaValue();

        Assert.assertEquals(expected, actual);
    }
}