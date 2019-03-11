package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EggTest {

    @Test
    public void testgetHasBeenFertilized() {
        //Given
        Egg egg = new Egg();
        boolean expectedResult = true;

        //When
        egg.setHasBeenFertilized(true);
        boolean actualResult = egg.getHasBeenFertilized();

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

}