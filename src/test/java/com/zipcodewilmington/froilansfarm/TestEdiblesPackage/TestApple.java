package com.zipcodewilmington.froilansfarm.TestEdiblesPackage;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EdiblePlant;
import org.junit.Assert;
import org.junit.Test;

public class TestApple {
    @Test
    public void testImplementsEdible(){
        //Arrange
        Apple apple = new Apple();

        //Assertion
        Assert.assertTrue(apple instanceof Edible);
    }
    @Test
    public void testImplementsEdiblePlant(){
        //Arrange
        Apple apple = new Apple();

        //Assertion
        Assert.assertTrue(apple instanceof EdiblePlant);
    }
    @Test
    public void testHasBeenFertilized(){
        //Arrange
        Apple apple = new Apple();

        //Action
        boolean test = apple.hasBeenFertilized();

        //Assertion
        Assert.assertFalse(test);
    }
    @Test
    public void testHasBeenHarvested(){
        //Arrange
        Apple apple = new Apple();

        //Action
        boolean test = apple.hasBeenHarvested();

        //Assertion
        Assert.assertFalse(test);
    }

}
