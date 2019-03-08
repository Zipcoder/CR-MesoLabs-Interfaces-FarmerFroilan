package com.zipcodewilmington.froilansfarm.Edible;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EdibleEggTest {

    EdibleEgg egg;

    @Before
    public void setup(){
        egg = new EdibleEgg();
    }

    @Test
    public void constructorTest(){
        int actual = egg.calories;
        Assert.assertEquals(80, actual);
    }
}