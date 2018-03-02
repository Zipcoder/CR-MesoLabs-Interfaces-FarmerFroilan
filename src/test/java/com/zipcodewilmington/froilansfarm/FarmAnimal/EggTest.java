package com.zipcodewilmington.froilansfarm.FarmAnimal;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EggTest {

    Egg egg;

    @Before
    public void setup() {
        egg = new Egg();
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(egg instanceof Edible);
    }

}