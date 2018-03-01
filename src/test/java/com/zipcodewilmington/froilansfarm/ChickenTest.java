package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Edible.Egg;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {
    Chicken chicken;

    @Before
    public void setup(){
        chicken = new Chicken();
    }

    @Test
    public void makeNoiseTest(){
        String expected = "Cheep!";
        String actual = chicken.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        EarCorn corn = new EarCorn();
        chicken.eat(corn);
        int expected = chicken.getCalories();
        int actual = chicken.getCalories();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void produceTest(){
        Egg expected = chicken.yield();
        Assert.assertNotNull(expected);
    }
}
