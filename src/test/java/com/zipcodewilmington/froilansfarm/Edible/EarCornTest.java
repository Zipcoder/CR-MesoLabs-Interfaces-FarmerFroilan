package com.zipcodewilmington.froilansfarm.Edible;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EarCornTest {

    EarCorn earCorn;

    @Before
    public void setup(){
        earCorn = new EarCorn();
    }

    @Test
    public void constructorTest(){
        int actual = earCorn.calories;
        Assert.assertEquals(60, actual);
    }
}
