package com.zipcodewilmington.froilansfarm.Farm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/4/18
 */
public class FarmTest {
    private Farm farm;
    private FoodStore foodStore;

    @Before
    public void setup() {
        foodStore = new FoodStore();

        farm = new Farm();

        farm.buildCoops();
        farm.buildStables();
    }

    @Test
    public void testStableConstruction() {
        int expected = 9;
        int actual = farm.getNumberOfHorses();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
}