package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ChickenTest {

    Chicken chickenTest;

    @Before
    public void setUp(){
        chickenTest = new Chicken();
    }

    @Test
    public void testImplementation(){
        Assert.assertEquals(true, chickenTest instanceof Animal);
    }
    @Test
    public void testImplementationProduce(){
        Assert.assertTrue(chickenTest instanceof Produce);
    }
    @Test
    public void testNoise(){
        String expected = "Cluck cluck";
        String actual = chickenTest.makeNoise();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testEat(){
        chickenTest.eat(new Tomato());
        int actual = chickenTest.foodFed.size();
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testYield(){
        EdibleEgg expected = chickenTest.yield();
        Assert.assertTrue(expected instanceof EdibleEgg);
    }
}
