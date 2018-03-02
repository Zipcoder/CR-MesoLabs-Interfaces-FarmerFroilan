package com.zipcodewilmington.froilansfarm.AnimalsTest;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HorseTest {

    Horse testHorse;

    @Before
    public void setup() {
        testHorse = new Horse();
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(testHorse instanceof Rideable);
    }
}
