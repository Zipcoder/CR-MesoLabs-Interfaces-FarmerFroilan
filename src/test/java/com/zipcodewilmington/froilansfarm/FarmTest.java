package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Buildings.Farm;
import com.zipcodewilmington.froilansfarm.Buildings.FarmHouse;
import org.junit.Assert;
import org.junit.Test;

public class FarmTest {

    // If one test fails, the unique part of that test is the problem
    // If all tests fail, FarmHouse is the problem

    @Test
    public void constructorTest1() {
        Farm farm = new Farm(4, 3, 5);
        Assert.assertEquals(farm.getChickenCoops().size(), 4);
        Assert.assertTrue(farm.getFarmHouse() instanceof FarmHouse);
    }

    @Test
    public void constructorTest2() {
        Farm farm = new Farm(4, 3, 5);
        Assert.assertEquals(farm.getHorseStables().size(), 3);
        Assert.assertTrue(farm.getFarmHouse() instanceof FarmHouse);
    }

    @Test
    public void constructorTest3() {
        Farm farm = new Farm(4, 3, 5);
        Assert.assertEquals(farm.getField().getCropRows().length, 5);
        Assert.assertTrue(farm.getFarmHouse() instanceof FarmHouse);
    }

}
