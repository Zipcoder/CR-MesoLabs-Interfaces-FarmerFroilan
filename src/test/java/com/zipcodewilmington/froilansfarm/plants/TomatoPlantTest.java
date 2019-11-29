package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.Tomato;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class TomatoPlantTest {

    Farmer froilan;
    TomatoPlant tomatoPlant;

    @Test
    public void constructorTest(){

        tomatoPlant = new TomatoPlant();

        Assert.assertFalse(tomatoPlant.hasBeenFertilized());
        Assert.assertFalse(tomatoPlant.hasBeenHarvested());
    }

    @Test
    public void harvestTest(){

        tomatoPlant = new TomatoPlant();

        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.yield();

        Assert.assertTrue(tomatoPlant.hasBeenHarvested());

    }

    @Test
    public void yieldTest(){

        froilan = new Farmer("Froilan");
        tomatoPlant = new TomatoPlant();

        tomatoPlant.setHasBeenFertilized(true);
        froilan.eat(tomatoPlant.yield());

        Assert.assertEquals(1, froilan.getFoodEaten());
    }


}