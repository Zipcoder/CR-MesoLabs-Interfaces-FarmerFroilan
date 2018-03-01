package com.zipcodewilmington.froilansfarm.cropTest;

import com.zipcodewilmington.froilansfarm.crop.Potato;
import com.zipcodewilmington.froilansfarm.crop.PotatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class PotatoPlantTest {

    @Test
    public void yieldTest(){
        PotatoPlant potatoPlantTest = new PotatoPlant();
        potatoPlantTest.setHasBeenFertilized(true);
        Potato actual = potatoPlantTest.yield();
        Assert.assertTrue(actual instanceof Potato);
    }

    @Test
    public void hasBeenHarvestedTest(){
        PotatoPlant potatoPlantTest = new PotatoPlant();
        potatoPlantTest.setHasBeenHarvested(true);
        boolean actual = potatoPlantTest.getHasBeenHarvested();
        Assert.assertTrue(actual);
    }

    @Test
    public void hasBeenFertilizedTest(){
        PotatoPlant potatoPlantTest = new PotatoPlant();
        potatoPlantTest.setHasBeenFertilized(true);
        boolean actual = potatoPlantTest.getHasBeenFertilized();
        Assert.assertTrue(actual);
    }
}

