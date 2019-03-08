package com.zipcodewilmington.froilansfarm.Edible;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PotatoTest {

    Potato potato;

    @Before
    public void setup(){
        potato = new Potato();
    }

    @Test
    public void constructorTest(){
        int actual = potato.calories;
        Assert.assertEquals(120, actual);
    }
}