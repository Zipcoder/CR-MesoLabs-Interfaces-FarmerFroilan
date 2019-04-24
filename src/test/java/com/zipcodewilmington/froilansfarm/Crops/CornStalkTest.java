package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CornStalkTest {

    CornStalk testCornStalk;

    @Before
    public void setUp(){
        testCornStalk = new CornStalk();
    }
    @Test
    public void testFertilized(){
        testCornStalk.setHasBeenFertilized(true);
        boolean actual = testCornStalk.isHasBeenFertilized();
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testHarvested(){
        testCornStalk.setHasBeenHarvested(true);
        boolean actual = testCornStalk.isHasBeenHarvested();
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testHarvested2(){
        testCornStalk.setHasBeenHarvested(false);
        boolean actual = testCornStalk.isHasBeenHarvested();
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testYield(){
        testCornStalk.setHasBeenFertilized(true);
        testCornStalk.setHasBeenHarvested(true);
        EarCorn actual = testCornStalk.yield();
        Assert.assertTrue(actual instanceof EarCorn);
    }
}
