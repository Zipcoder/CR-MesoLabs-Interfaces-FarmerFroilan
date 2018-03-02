package com.zipcodewilmington.froilansfarm.FarmBuildings;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenCoopTest {

    ChickenCoop testCoop;

    @Before
    public void setUp(){
        testCoop = new ChickenCoop();
    }

    @Test
    public void testCoopChicks(){
        Chicken testChick = new Chicken();
        testCoop.getChickens().add(testChick);
        int actual = testCoop.getChickens().size();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

}
