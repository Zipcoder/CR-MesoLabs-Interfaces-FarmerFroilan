package com.zipcodewilmington.froilansfarm.Farm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenCoopTest {

    @Test
    public void getChickenCoopTest(){
        //Given
        ChickenCoop coopTest = new ChickenCoop();

        coopTest.addChicken();
        coopTest.addChicken();
        coopTest.addChicken();

        //When
        int expected = 3;
        int actual = coopTest.getChickensInCoop().size();

        //Then
        Assert.assertEquals(expected, actual);
    }

}