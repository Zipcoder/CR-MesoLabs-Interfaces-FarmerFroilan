package com.zipcodewilmington.froilansfarm.farmTest;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {

    ChickenCoop testChickenCoop = new ChickenCoop();

    @Test
    public void getChickensInCoopTest(){
        Chicken testChicken = new Chicken();
        testChickenCoop.getChickensInCoop().add(testChicken);
        Chicken expected = testChicken;
        Chicken actual = testChickenCoop.getChickensInCoop().get(0);
        Assert.assertEquals(expected, actual);
    }
}
