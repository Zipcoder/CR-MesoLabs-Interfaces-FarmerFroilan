package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Edible.EdibleEgg;
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
    public void produceReproductiveTest(){
        chicken.fertilize();
        chicken.yield();
        Assert.assertNotNull(chicken.eggs.get(0));
    }

    @Test
    public void produceEdibleTest(){
        chicken.fertilize();
        EdibleEgg expected = chicken.yield();
        Assert.assertNull(expected);
    }
}
