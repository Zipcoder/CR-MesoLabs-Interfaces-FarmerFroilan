package com.zipcodewilmington.froilansfarm.Edible;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TomatoTest {

    Tomato tomato;

    @Before
    public void setup(){
        tomato = new Tomato();
    }

    @Test
    public void constructorTest(){
        int actual = tomato.calories;
        Assert.assertEquals(40, actual);
    }
}