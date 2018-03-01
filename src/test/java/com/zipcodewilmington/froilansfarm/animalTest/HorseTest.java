package com.zipcodewilmington.froilansfarm.animalTest;

import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crop.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void eatTest() {
        Horse testHorse = new Horse();
        EarCorn testCorn = new EarCorn();
        testHorse.eat(testCorn);
        int expected = 1;
        int actual = testHorse.getFoodEaten().size();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void makeNoiseTest(){
        Horse testHorse = new Horse();
        String expected = "Neigh!";
        String actual = testHorse.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mountTest(){
        Horse testHorse = new Horse();
        testHorse.ride();
        boolean expected = testHorse.getHasBeenMounted();
        Assert.assertTrue(expected);
    }
    @Test
    public void rideTest(){
        Horse testHorse = new Horse();
        testHorse.ride();
        testHorse.stopRiding();
        boolean expected = testHorse.getHasBeenRidden();
        Assert.assertTrue(expected);
    }

    @Test
    public void endOfDayResetTest(){
        Horse testHorse = new Horse();
        EarCorn testCorn = new EarCorn();
        testHorse.ride();
        testHorse.stopRiding();
        testHorse.eat(testCorn);
        testHorse.endOfDayReset();
        boolean actual1 = testHorse.getHasBeenMounted();
        boolean actual2 = testHorse.getHasBeenRidden();
        int expected3 = 0;
        int actual3 = testHorse.getFoodEaten().size();

        Assert.assertFalse(actual1);
        Assert.assertFalse(actual2);
        Assert.assertEquals(expected3, actual3);

    }
}
