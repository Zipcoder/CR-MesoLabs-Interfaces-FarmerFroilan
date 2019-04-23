package com.zipcodewilmington.froilansfarm.farmTest;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.crop.EarCorn;
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

    @Test
    public void startOfDayResetTest(){
        Chicken testChicken1 = new Chicken();
        Chicken testChicken2 = new Chicken();
        testChicken1.eat(new EarCorn());
        testChicken2.eat(new EarCorn());
        testChickenCoop.getChickensInCoop().add(testChicken1);
        testChickenCoop.getChickensInCoop().add(testChicken2);
        testChickenCoop.startOfDayReset();
        int expected = 0;
        int expected2 = 0;
        int actual = testChickenCoop.getChickensInCoop().get(0).getFoodEaten().size();
        int actual2 = testChickenCoop.getChickensInCoop().get(1).getFoodEaten().size();
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }
}
