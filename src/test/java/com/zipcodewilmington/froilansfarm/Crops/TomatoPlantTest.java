package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TomatoPlantTest {

    TomatoPlant testTomatoPlant;

    @Before
    public void setUp(){
        testTomatoPlant = new TomatoPlant();
    }

    @Test
    public void testFertilized(){
        testTomatoPlant.setHasBeenFertilized(true);
        boolean actual = testTomatoPlant.isHasBeenFertilized();
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testHarvested() {
        testTomatoPlant.setHasBeenHarvested(true);
        boolean actual = testTomatoPlant.isHasBeenHarvested();
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHarvested2(){
        testTomatoPlant.setHasBeenHarvested(false);
        boolean actual = testTomatoPlant.isHasBeenHarvested();
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testYield(){
        testTomatoPlant.setHasBeenFertilized(true);
        Tomato actual = testTomatoPlant.yield();
        Assert.assertTrue(actual instanceof Tomato);
    }
}
