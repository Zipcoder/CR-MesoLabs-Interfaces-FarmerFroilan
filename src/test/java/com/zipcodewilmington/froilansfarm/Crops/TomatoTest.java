package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TomatoTest {

    Tomato tomato;

    @Before
    public void setup() {
        tomato = new Tomato();
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(tomato instanceof Edible);
    }

}