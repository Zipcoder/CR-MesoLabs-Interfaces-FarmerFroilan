package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.Egg;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {
    Chicken chicken;
    Edible food;
    Egg egg;

    @Before
    public void setUp() throws Exception {
        chicken = new Chicken();
    }

    @Test
    public void eatTest(){
        chicken.eat(food);

        Integer expected = 1;
        Integer actual = chicken.amountOfFoodEaten();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eatTest1(){
        Integer expected = 0;
        Integer actual = chicken.amountOfFoodEaten();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void makeNoiseTest(){
        String expected = "cluck cluck!";
        String actual = chicken.makeNoise();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void yieldTest(){
        chicken.hasBeenFertilized();

        Edible expected = egg;
        Edible actual = chicken.yield();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void yieldTest1(){
        Edible expected = null;
        Edible actual = chicken.yield();

        Assert.assertEquals(expected,actual);
    }


}
