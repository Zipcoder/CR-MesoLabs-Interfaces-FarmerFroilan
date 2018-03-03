package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Egg;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void makeNoiseTest() {
        Chicken chicken = new Chicken();
        Assert.assertEquals("Cluck", chicken.makeNoise());
    }

    @Test
    public void fertilizeTest() {
        Chicken chicken = new Chicken();
        chicken.fertilize();
        Assert.assertTrue(chicken.isFertilized());
    }

    @Test
    public void yieldTest() {
        Chicken chicken = new Chicken();
        chicken.fertilize();
        Assert.assertTrue(chicken.yield() instanceof Egg);
    }

}
