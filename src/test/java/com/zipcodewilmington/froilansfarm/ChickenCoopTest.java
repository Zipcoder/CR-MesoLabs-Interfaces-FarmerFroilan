package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Buildings.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {

    @Test
    public void addChickenTest() {
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.addChicken(new Chicken());
        chickenCoop.addChicken(new Chicken());
        Assert.assertEquals(2, chickenCoop.getChickens().size());
    }

}
