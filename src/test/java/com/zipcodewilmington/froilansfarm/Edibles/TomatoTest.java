package com.zipcodewilmington.froilansfarm.Edibles;

import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {

    Tomato testTomato = new Tomato();

    @Test
    public void testIsEdible(){
        boolean actual = testTomato.isEdible();
        Assert.assertTrue(actual);
    }
}
