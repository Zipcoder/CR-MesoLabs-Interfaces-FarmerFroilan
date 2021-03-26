package com.zipcodewilmington.froilansfarm.TestEdiblesPackage;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EarCorn;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EdiblePlant;
import org.junit.Assert;
import org.junit.Test;

public class TestEarCorn {
    @Test
    public void testImplementsEdible(){
        //Arrange
        EarCorn corn = new EarCorn();

        //Assertion
        Assert.assertTrue(corn instanceof Edible);
    }
    @Test
    public void testImplementsEdiblePlant(){
        //Arrange
        EarCorn corn = new EarCorn();

        //Assertion
        Assert.assertTrue(corn instanceof EdiblePlant);
    }
    @Test
    public void testHasBeenFertilized(){
        //Arrange
        EarCorn corn = new EarCorn();

        //Action
        boolean test = corn.hasBeenFertilized();

        //Assertion
        Assert.assertFalse(test);
    }
    @Test
    public void testHasBeenHarvested(){
        //Arrange
        EarCorn corn = new EarCorn();

        //Action
        boolean test = corn.hasBeenHarvested();

        //Assertion
        Assert.assertFalse(test);
    }
}
