package com.zipcodewilmington.froilansfarm.Food;

import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public class FoodTest {
    @Test
    public void testConsume() {
        Food dummy = new FoodDummy();

        Assert.assertFalse(dummy.isConsumed());

        dummy.consume();

        Assert.assertTrue(dummy.isConsumed());
    }

    private class FoodDummy extends Food {
        private FoodDummy() {
            super(StaminaValue.ONE);
        }
    }
}