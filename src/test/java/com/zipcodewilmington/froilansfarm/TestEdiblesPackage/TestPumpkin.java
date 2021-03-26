package com.zipcodewilmington.froilansfarm.TestEdiblesPackage;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EdiblePlant;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Pumpkin;
import org.junit.Assert;
import org.junit.Test;

public class TestPumpkin {
    @Test
    public void testImplementsEdible(){
        //Arrange
        Pumpkin pumpkin = new Pumpkin();

        //Assertion
        Assert.assertTrue(pumpkin instanceof Edible);
    }
    @Test
    public void testImplementsEdiblePlant(){
        //Arrange
        Pumpkin pumpkin = new Pumpkin();

        //Assertion
        Assert.assertTrue(pumpkin instanceof EdiblePlant);
    }
    @Test
    public void testHasBeenFertilized(){
        //Arrange
        Pumpkin pumpkin = new Pumpkin();

        //Action
        boolean test = pumpkin.hasBeenFertilized();

        //Assertion
        Assert.assertFalse(test);
    }
    @Test
    public void testHasBeenHarvested(){
        //Arrange
        Pumpkin pumpkin = new Pumpkin();

        //Action
        boolean test = pumpkin.hasBeenHarvested();

        //Assertion
        Assert.assertFalse(test);
    }
}
