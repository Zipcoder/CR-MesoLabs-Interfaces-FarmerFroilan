package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/4/18
 */
public class FoodReplicatorTest {
    @Test
    public void testReplicate() {
        Tomato tomato = new Tomato();
        String expected = tomato.getClass().getSimpleName();

        Edible food = FoodReplicator.replicate(expected);
        String actual = food.getClass().getSimpleName();

        Assert.assertEquals(expected, actual);
    }

}