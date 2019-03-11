package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void testYield(){
        //Given
        TomatoPlant tomatoPlant = new TomatoPlant();

        //When
        Assert.assertTrue(tomatoPlant.yield() instanceof Tomato);
    }
}
