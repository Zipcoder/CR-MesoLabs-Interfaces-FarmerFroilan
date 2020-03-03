package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.food.Egg;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    Chicken testChicken = new Chicken();

    @Test
    public void inheritanceTest(){
        Assert.assertTrue(testChicken instanceof Animal);
    }

    @Test
    public void inheritanceTest2(){
        Assert.assertTrue(testChicken instanceof NoiseMaker);
    }

    @Test
    public void inheritanceTest3(){
        Assert.assertTrue((testChicken instanceof Eater));
    }

    @Test
    public void impementationTest(){Assert.assertTrue(testChicken instanceof Produce);}

    @Test
    public void isYeoildTest(){
        Assert.assertFalse(testChicken.isYeoild());
    }

    @Test
    public void storeFoodTest(){
        Assert.assertFalse(testChicken.storeFood());
    }

    @Test
    public void yieldTest(){
        Assert.assertTrue(testChicken.yield() instanceof Egg);
    }

    @Test
    public void makeNoiseTest(){

    }

    @Test
    public void eatTest(){

    }
}
