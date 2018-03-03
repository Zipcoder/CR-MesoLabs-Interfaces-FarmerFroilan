package com.zipcodewilmington.froilansfarm.BuildingsTest;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Buildings.ChickenCoop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenCoopTest {
    private ChickenCoop testChickenCoop;
    private Chicken testChicken1;
    private Chicken testChicken2;

    @Before
    public void setup() {
        testChickenCoop = new ChickenCoop();
        testChicken1 = new Chicken();
        testChicken2 = new Chicken();

    }

    @Test
    public void addHorseToStableTest() {
        testChickenCoop.addChickenToCoop(testChicken1);
        testChickenCoop.addChickenToCoop(testChicken2);
        int expected = 2;
        int actual = testChickenCoop.getChickensInCoop().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeHorseFromStableTest() {
        testChickenCoop.addChickenToCoop(testChicken1);
        testChickenCoop.addChickenToCoop(testChicken2);
        testChickenCoop.removeChickenFromCoop(testChicken1);
        int expected = 1;
        int actual = testChickenCoop.getChickensInCoop().size();
        Assert.assertEquals(expected, actual);
    }
}
