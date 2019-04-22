package com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void yieldTest(){
        //Given
        CornStalk stalky = new CornStalk();

        //When
        stalky.fertilize();
        stalky.harvest();

        //Then
        Assert.assertTrue(stalky.yield() instanceof EarCorn);
    }

    @Test
    public void noYieldTest(){
        //Given
        CornStalk stalky = new CornStalk();

        //When
        stalky.harvest();

        //Then
        Assert.assertTrue(stalky.yield() == null);
    }

}
