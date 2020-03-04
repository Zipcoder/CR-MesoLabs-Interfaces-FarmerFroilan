package com.zipcodewilmington.froilansfarm.foodtest;

import com.zipcodewilmington.froilansfarm.food.CarrotPlant;
import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.HempPlant;
import org.junit.Assert;
import org.junit.Test;

public class CarrotPlantTest {


    CarrotPlant test = new CarrotPlant();
    private Edible carrot = test.yielded;

    @Test
    public void CarrotPlantYieldTest(){

        test.setHasBeenFertilized(true);
        test.setHasBeenHarvested(false);

        Edible expected = carrot;
        Edible actual  = test.getYielded();

        Assert.assertEquals(actual,expected);

    }
}
