package com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void yieldTest(){
        //Given
        TomatoPlant stalky = new TomatoPlant();

        //When
        stalky.fertilize();
        stalky.harvest();

        //Then
        Assert.assertTrue(stalky.yield() instanceof Tomato);
    }

    @Test
    public void noYieldTest(){
        //Given
        TomatoPlant stalky = new TomatoPlant();

        //When
        stalky.harvest();

        //Then
        Assert.assertTrue(stalky.yield() == null);
    }

}
