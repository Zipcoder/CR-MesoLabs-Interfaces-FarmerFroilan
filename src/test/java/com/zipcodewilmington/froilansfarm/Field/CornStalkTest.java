package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornStalkTest {

    @Test
    public void CornStalkYieldTest(){
        //Given
        CornStalk cornStalkTest = new CornStalk();

        cornStalkTest.setHasBeenFertilized(true);
        cornStalkTest.setHasBeenHarvested(false);

        //When
        Edible actual = cornStalkTest.yields();

        //Then
        Assert.assertTrue(actual instanceof EarCorn);
    }
}