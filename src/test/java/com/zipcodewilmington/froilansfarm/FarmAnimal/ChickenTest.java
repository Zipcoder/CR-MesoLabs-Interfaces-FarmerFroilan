package com.zipcodewilmington.froilansfarm.FarmAnimal;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {

    Chicken chicken;

    @Before
    public void setup() {
        chicken = new Chicken();
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(chicken instanceof Produce);
        Assert.assertTrue(chicken instanceof Eater);
    }

    @Test
    public void inheritanceTest() {
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void yieldTest() {
        Class expected = Egg.class;
        Class actual = chicken.yield().getClass();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void chickenSpeakTest() {
        String expected = "BWAAAK";
        String actual = chicken.makeNoise();

        Assert.assertEquals(expected, actual);
    }
}