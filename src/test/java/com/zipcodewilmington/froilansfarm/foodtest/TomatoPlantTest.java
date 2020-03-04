package com.zipcodewilmington.froilansfarm.foodtest;

import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.HempPlant;
import com.zipcodewilmington.froilansfarm.food.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    TomatoPlant test = new TomatoPlant();
    private Edible tomato = test.yielded;

    @Test
    public void TomatoPlantYieldTest(){

        test.setHasBeenFertilized(true);
        test.setHasBeenHarvested(false);

        Edible expected = tomato;
        Edible actual  = test.getYielded();

        Assert.assertEquals(actual,expected);

    }
}
