package com.zipcodewilmington.froilansfarm.cropTest;

import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    CornStalk cornStalkTest = new CornStalk();

    @Test
    public void hasBeenHarvestedTest(){
        cornStalkTest.setHasBeenHarvested(true);
        boolean actual = cornStalkTest.getHasBeenHarvested();
        Assert.assertTrue(actual);
    }

    @Test
    public void hasBeenFertilized(){
        cornStalkTest.setHasBeenFertilized(true);
        boolean actual = cornStalkTest.getHasBeenFertilized();
        Assert.assertTrue(actual);
    }

    @Test
    public void yieldTest(){
        cornStalkTest.setHasBeenFertilized(true);
        EarCorn earCornTest = cornStalkTest.yield();
        Assert.assertTrue(earCornTest instanceof EarCorn);
    }

    @Test
    public void endOfDayResetTest(){
        cornStalkTest.setHasBeenFertilized(true);
        cornStalkTest.setHasBeenHarvested(true);
        cornStalkTest.endOfDayReset();
        boolean expected = cornStalkTest.getHasBeenFertilized();
        boolean expected2 = cornStalkTest.getHasBeenHarvested();
        Assert.assertFalse(expected);
        Assert.assertFalse(expected2);
    }
}
