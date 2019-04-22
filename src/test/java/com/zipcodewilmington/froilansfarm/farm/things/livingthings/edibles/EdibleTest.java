package com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles;

import org.junit.Assert;
import org.junit.Test;

public class EdibleTest {

    @Test
    public void getEnergyValueTest(){
        //Given
        EarCorn corny = new EarCorn();

        //When
        int expected = 3;
        int actual = corny.getEnergyValue();

        //Then
        Assert.assertEquals(expected,actual);

    }

}
