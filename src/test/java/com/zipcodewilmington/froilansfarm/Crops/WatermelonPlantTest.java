package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.Watermelon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WatermelonPlantTest {

    WatermelonPlant testWatermelonPlant;

    @Before
    public void setUp(){
        testWatermelonPlant = new WatermelonPlant();
    }

    @Test
    public void testFertilized(){
        testWatermelonPlant.setHasBeenFertilized(true);
        boolean actual = testWatermelonPlant.isHasBeenFertilized();
        Assert.assertTrue(actual);
    }
    @Test
    public void testHarvested(){
        testWatermelonPlant.setHasBeenHarvested(true);
        boolean actual = testWatermelonPlant.isHasBeenHarvested();
        Assert.assertTrue(actual);
    }
    @Test
    public void testHarvested2(){
        testWatermelonPlant.setHasBeenHarvested(false);
        boolean actual = testWatermelonPlant.isHasBeenHarvested();
        Assert.assertFalse(actual);
    }
    @Test
    public void testYield(){
        testWatermelonPlant.setHasBeenFertilized(true);
        testWatermelonPlant.setHasBeenHarvested(true);
        Watermelon actual = testWatermelonPlant.yield();
        Assert.assertTrue(actual instanceof Watermelon);
    }
}
