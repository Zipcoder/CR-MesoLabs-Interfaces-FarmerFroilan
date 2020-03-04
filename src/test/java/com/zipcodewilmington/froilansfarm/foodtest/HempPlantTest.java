package com.zipcodewilmington.froilansfarm.foodtest;

import com.zipcodewilmington.froilansfarm.food.CornStalk;
import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.HempPlant;
import org.junit.Assert;
import org.junit.Test;

public class HempPlantTest {

    HempPlant test = new HempPlant();
    private Edible Hemp = test.yielded;

    @Test
    public void HempPlantYieldTest(){

        test.setHasBeenFertilized(true);
        test.setHasBeenHarvested(false);

        Edible expected = Hemp;
        Edible actual  = test.getYielded();

        Assert.assertEquals(actual,expected);

    }
}
