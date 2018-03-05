package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TomatoPlantTest {

    @Test
    public void FertilizeAndYieldsTest() {
        //Given
        TomatoPlant plantTest = new TomatoPlant();

        plantTest.setHasBeenFertilized(true);
        plantTest.setHasBeenHarvested(false);

        //When
        Edible actual = plantTest.yields();

        //Then
        Assert.assertTrue(actual instanceof Tomato);
    }


}