package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Plants.Potato;
import com.zipcodewilmington.froilansfarm.Plants.PotatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class PotatoPlantTest {

    @Test
    public void isFertilizedTest() {
        PotatoPlant tomatoPlant = new PotatoPlant();
        Assert.assertTrue(!(tomatoPlant.isFertilized()));
    }

    @Test
    public void isNotFertilizedTest() {
        PotatoPlant tomatoPlant = new PotatoPlant();
        tomatoPlant.fertilize();
        Assert.assertTrue(tomatoPlant.isFertilized());
    }

    @Test
    public void yieldTest() {
        PotatoPlant tomatoPlant = new PotatoPlant();
        tomatoPlant.fertilize();
        Assert.assertTrue(tomatoPlant.yield() instanceof Potato);
    }

}
