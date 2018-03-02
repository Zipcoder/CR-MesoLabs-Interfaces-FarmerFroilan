package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Food.Egg;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public class PersonTest {
    Person Rin;

    @Before
    public void setup() {
        Rin = new Farmer("anon", 10);
    }

    @Test
    public void testConstruction() {
        Assert.assertTrue(Rin.isHungry());
    }

    @Test
    public void testEat() {
        Assert.assertTrue(Rin.isHungry());
        Rin.eat(new Egg());
        Assert.assertFalse(Rin.isHungry());
    }

    @Test
    public void testIsHungry() {
    }
}