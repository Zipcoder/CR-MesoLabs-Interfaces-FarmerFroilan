package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edible.EarCorn;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CornStalkTest {

    CornStalk cornStalk = new CornStalk();

    @Before
    public void setup(){
        cornStalk = new CornStalk();
    }

    @Test
    public void yieldPositiveTest(){
        cornStalk.fertilize();
        cornStalk.harvest();
        EarCorn earCorn = cornStalk.yield();
        Assert.assertNotNull(earCorn);
    }

    @Test
    public void yieldNotHarvestedTest(){
        cornStalk.fertilize();
        EarCorn earCorn = cornStalk.yield();
        Assert.assertNull(earCorn);
    }

    @Test
    public void yieldNotFertilizedTest(){
        cornStalk.harvest();
        EarCorn earCorn = cornStalk.yield();
        Assert.assertNull(earCorn);
    }
}

