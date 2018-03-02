package com.zipcodewilmington.froilansfarm.AnimalsTest;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {

    Chicken testChicken;

    @Before
    public void setup() {
        testChicken = new Chicken();
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(testChicken instanceof Produce);
    }



}
