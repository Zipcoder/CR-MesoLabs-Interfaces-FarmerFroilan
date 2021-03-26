package com.zipcodewilmington.froilansfarm.TestEdiblesPackage;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EdiblePlant;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class TestTomato {
    @Test
    public void testImplementsEdible(){
        //Arrange
        Tomato tomato = new Tomato();

        //Assertion
        Assert.assertTrue(tomato instanceof Edible);
    }
    @Test
    public void testImplementsEdiblePlant(){
        //Arrange
        Tomato tomato = new Tomato();

        //Assertion
        Assert.assertTrue(tomato instanceof EdiblePlant);
    }
    @Test
    public void testHasBeenFertilized(){
        //Arrange
        Tomato tomato = new Tomato();

        //Action
        boolean test = tomato.hasBeenFertilized();

        //Assertion
        Assert.assertFalse(test);
    }
    @Test
    public void testHasBeenHarvested(){
        //Arrange
        Tomato tomato = new Tomato();

        //Action
        boolean test = tomato.hasBeenHarvested();

        //Assertion
        Assert.assertFalse(test);
    }
}
