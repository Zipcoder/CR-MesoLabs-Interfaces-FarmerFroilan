package com.zipcodewilmington.froilansfarm.Farm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StableTest {

    @Test
    public void GetStableTest(){
        //Given
        Stable stableTest = new Stable();

        stableTest.addHorse();
        stableTest.addHorse();
        stableTest.addHorse();

        //When
        int expected = 3;
        int actual = stableTest.getHorsesInStable().size();

        //Then
        Assert.assertEquals(expected, actual);
    }


}