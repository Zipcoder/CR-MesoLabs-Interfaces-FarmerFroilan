package com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Vegetable;
import org.junit.Assert;
import org.junit.Test;

public class ArbitraryVegetationTest {

    @Test
    public void yieldTest(){
        //Given
        ArbitrayVegetation stalky = new ArbitrayVegetation();

        //When
        stalky.fertilize();
        stalky.harvest();

        //Then
        Assert.assertTrue(stalky.yield() instanceof Vegetable);
    }

    @Test
    public void noYieldTest(){
        //Given
        ArbitrayVegetation stalky = new ArbitrayVegetation();

        //When
        stalky.harvest();

        //Then
        Assert.assertTrue(stalky.yield() == null);
    }

}
