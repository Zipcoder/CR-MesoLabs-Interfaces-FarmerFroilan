package com.zipcodewilmington.froilansfarm.TestEdiblesPackage;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EdiblePlant;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Egg;
import org.junit.Assert;
import org.junit.Test;

public class TestEgg {
    @Test
    public void testImplementsEdiblePlant(){
        //Arrange
        Egg egg = new Egg();

        //Assertion
        Assert.assertTrue(egg instanceof Edible);
    }
    @Test
    public void testHasBeenFertilized(){
        //Arrange
        Egg egg = new Egg();

        //Action
        boolean test = egg.hasBeenFertilized();

        //Assertion
        Assert.assertFalse(test);
    }
}
