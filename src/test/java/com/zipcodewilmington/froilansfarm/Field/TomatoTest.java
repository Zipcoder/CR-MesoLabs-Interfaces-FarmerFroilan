package com.zipcodewilmington.froilansfarm.Field;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoTest {

    @Test
    public void tomatoEdibleTest(){
    Tomato tomatoTest = new Tomato();

    boolean expected = true;
    boolean actual = tomatoTest.IsEdible();

    Assert.assertEquals(expected, actual);
    }

}