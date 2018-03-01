package com.zipcodewilmington.froilansfarm.cropTest;

import com.zipcodewilmington.froilansfarm.crop.Tomato;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void yieldTest(){
        TomatoPlant tomatoPlantTest = new TomatoPlant();
        tomatoPlantTest.setHasBeenFertilized(true);
        Tomato actual = tomatoPlantTest.yield();
        Assert.assertTrue(actual instanceof Tomato);
    }

    @Test
    public void hasBeenHarvestedTest(){
        TomatoPlant tomatoPlantTest = new TomatoPlant();
        tomatoPlantTest.setHasBeenHarvested(true);
        boolean actual = tomatoPlantTest.getHasBeenHarvested();
        Assert.assertTrue(actual);
    }

    @Test
    public void hasBeenFertilizedTest(){
        TomatoPlant tomatoPlantTest = new TomatoPlant();
        tomatoPlantTest.setHasBeenFertilized(true);
        boolean actual = tomatoPlantTest.getHasBeenFertilized();
        Assert.assertTrue(actual);
    }
}
