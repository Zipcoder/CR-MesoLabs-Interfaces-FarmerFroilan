package com.zipcodewilmington.froilansfarm.AnimalsTest;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
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
    public void implementationTest1() {
        Assert.assertTrue(testHorse instanceof Rideable);
    }

    @Test
    public void implementationTest2() {
        Assert.assertTrue(testHorse instanceof Animal);
    }

    @Test
    public void toggleIsMountedTest1() {
        testHorse.toggleIsMounted();
        boolean expected = true;
        boolean actual = testHorse.getIsMounted();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toggleIsMountedTest2() {
        boolean expected = false;
        boolean actual = testHorse.getIsMounted();
        Assert.assertEquals(expected, actual);
    }


}
