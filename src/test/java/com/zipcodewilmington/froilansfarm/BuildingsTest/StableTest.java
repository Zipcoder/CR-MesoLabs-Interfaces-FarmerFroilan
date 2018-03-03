package com.zipcodewilmington.froilansfarm.BuildingsTest;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Buildings.Stable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StableTest {

    private Stable testStable;
    private Horse testHorse1;
    private Horse testHorse2;

    @Before
    public void setup() {
        testStable = new Stable();
        testHorse1 = new Horse();
        testHorse2 = new Horse();

    }

    @Test
    public void addHorseToStableTest() {
        testStable.addHorseToStable(testHorse1);
        testStable.addHorseToStable(testHorse2);
        int expected = 2;
        int actual = testStable.getHorsesInStable().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeHorseFromStableTest() {
        testStable.addHorseToStable(testHorse1);
        testStable.addHorseToStable(testHorse2);
        testStable.removeHorseFromStable(testHorse1);
        int expected = 1;
        int actual = testStable.getHorsesInStable().size();
        Assert.assertEquals(expected, actual);
    }

}
