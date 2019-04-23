package com.zipcodewilmington.froilansfarm.animalTest;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Egg;
import com.zipcodewilmington.froilansfarm.crop.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void getHasBeenHarvestedTest(){
        Chicken testChicken = new Chicken();
        testChicken.setHasBeenHarvested(true);
        boolean expected = testChicken.getHasBeenHarvested();
        Assert.assertTrue(expected);
    }

    @Test
    public void getHasBeenFertilizedTest(){
        Chicken testChicken = new Chicken();
        testChicken.setHasBeenFertilized(true);
        boolean expected = testChicken.getHasBeenFertilized();
        Assert.assertTrue(expected);
    }

    @Test
    public void makeNoiseTest(){
        Chicken testChicken = new Chicken();
        String actual = testChicken.makeNoise();
        String expected = "Bawk!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        Chicken testChicken = new Chicken();
        EarCorn testEarCorn = new EarCorn();
        testChicken.eat(testEarCorn);
        int actual = testChicken.getFoodEaten().size();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void  yieldTest(){
        Chicken testChicken = new Chicken();
        testChicken.setHasBeenFertilized(false);
        testChicken.setHasBeenHarvested(false);
        Egg expected = testChicken.yield();
        Assert.assertTrue(expected instanceof Egg);
    }

    @Test
    public void endOfDayResetTest(){
        Chicken testChicken = new Chicken();
        EarCorn testCorn = new EarCorn();
        testChicken.setHasBeenHarvested(true);
        testChicken.setHasBeenFertilized(true);
        testChicken.eat(testCorn);
        testChicken.startOfDayReset();
        boolean actual1 = testChicken.getHasBeenHarvested();
        boolean actual2 = testChicken.getHasBeenFertilized();
        int expected3 = 0;
        int actual3 = testChicken.getFoodEaten().size();
        Assert.assertFalse(actual1);
        Assert.assertFalse(actual2);
        Assert.assertEquals(expected3,actual3);
    }
}
