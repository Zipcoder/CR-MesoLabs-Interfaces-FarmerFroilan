package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edible.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TomatoPlantTest {

    TomatoPlant tomatoPlant;

    @Before
    public void setup(){
        tomatoPlant = new TomatoPlant();
    }

    @Test
    public void yieldPositiveTest(){
        tomatoPlant.fertilize();
        tomatoPlant.harvest();
        Tomato tomato = tomatoPlant.yield();
        Assert.assertNotNull(tomato);
    }

    @Test
    public void yieldNotHarvestedTest(){
        tomatoPlant.fertilize();
        Tomato tomato = tomatoPlant.yield();
        Assert.assertNull(tomato);
    }

    @Test
    public void yieldNotFertilizedTest(){
        tomatoPlant.harvest();
        Tomato tomato = tomatoPlant.yield();
        Assert.assertNull(tomato);
    }
}
