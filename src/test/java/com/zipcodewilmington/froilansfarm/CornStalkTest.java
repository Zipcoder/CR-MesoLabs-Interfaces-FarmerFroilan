package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Plants.CornStalk;
import com.zipcodewilmington.froilansfarm.Plants.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void isFertilizedTest() {
        CornStalk tomatoPlant = new CornStalk();
        Assert.assertTrue(!(tomatoPlant.isFertilized()));
    }

    @Test
    public void isNotFertilizedTest() {
        CornStalk tomatoPlant = new CornStalk();
        tomatoPlant.fertilize();
        Assert.assertTrue(tomatoPlant.isFertilized());
    }

    @Test
    public void yieldTest() {
        CornStalk tomatoPlant = new CornStalk();
        tomatoPlant.fertilize();
        Assert.assertTrue(tomatoPlant.yield() instanceof EarCorn);
    }

}
