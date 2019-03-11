package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ChickenTest {

    @Test
    public void testMakeNoise(){
        Chicken testChicken = new Chicken();
        String expected = "Bawk Bawk";

        Assert.assertEquals(expected, testChicken.makeNoise());
    }
    @Test
    public void testEat(){
        //Given
        Chicken testChicken = new Chicken();
        Tomato edibleTomato = new Tomato();
        //When
        testChicken.eat(edibleTomato);
        List fakeStomach = new ArrayList<Edible>();
        fakeStomach.add(edibleTomato);
        //Then
        Assert.assertEquals(fakeStomach, testChicken.getStomachContents());
    }

    @Test
    public void testYield(){
        //Given
        Chicken testChicken = new Chicken();

        //When
        Assert.assertTrue(testChicken.yield() instanceof Egg);
    }
}
