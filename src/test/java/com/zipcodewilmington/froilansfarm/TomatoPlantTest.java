package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Plants.Tomato;
import com.zipcodewilmington.froilansfarm.Plants.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void isFertilizedTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        Assert.assertTrue(!(tomatoPlant.isFertilized()));
    }

    @Test
    public void isNotFertilizedTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();
        Assert.assertTrue(tomatoPlant.isFertilized());
    }

    @Test
    public void yieldTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();
        Assert.assertTrue(tomatoPlant.yield() instanceof Tomato);
    }

}
