package com.zipcodewilmington.froilansfarm.FarmBuildings;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StableTest {

    Stable testStable;

    @Before
    public void setUp(){
        testStable = new Stable();
    }

    @Test
    public void testStable(){
        Horse testHorse = new Horse();
        testStable.getHorses().add(testHorse);
        int actual = testStable.getHorses().size();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}
