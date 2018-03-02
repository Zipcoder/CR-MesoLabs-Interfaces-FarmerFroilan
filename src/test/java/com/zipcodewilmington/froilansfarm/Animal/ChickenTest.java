package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public class ChickenTest {
    @Test
    public void testYieldEgg() {
        Chicken chicken = new Chicken();
        Edible actual = chicken.yield();
        Egg egg = new Egg();

        Assert.assertEquals(actual.getClass(), egg.getClass());
    }
}