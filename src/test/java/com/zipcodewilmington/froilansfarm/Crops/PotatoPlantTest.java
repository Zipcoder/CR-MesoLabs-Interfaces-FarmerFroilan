package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edible.Potato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PotatoPlantTest {

    PotatoPlant potatoPlant;

    @Before
    public void setup(){
        potatoPlant = new PotatoPlant();
    }

    @Test
    public void yieldPositiveTest(){
        potatoPlant.fertilize();
        potatoPlant.harvest();
        Potato potato = potatoPlant.yield();
        Assert.assertNotNull(potato);
    }

    @Test
    public void yieldNotHarvestedTest(){
        potatoPlant.fertilize();
        Potato potato = potatoPlant.yield();
        Assert.assertNull(potato);
    }

    @Test
    public void yieldNotFertilizedTest(){
        potatoPlant.harvest();
        Potato potato = potatoPlant.yield();
        Assert.assertNull(potato);
    }
}
