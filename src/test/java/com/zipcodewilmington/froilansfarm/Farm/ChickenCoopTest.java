package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Chicken;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenCoopTest {
    ChickenCoop chickenCoop;

    @Before
    public void setup(){
        chickenCoop = new ChickenCoop();
    }

    @Test
    public void varArgsConstructurTest(){
        Chicken expected = new Chicken();
        ChickenCoop chickenCoop2 = new ChickenCoop(new Chicken(), expected);
        Assert.assertEquals(expected, chickenCoop2.getChickens().get(1));
    }

    @Test
    public void addChickenTest(){
        Chicken chicken = new Chicken();
        chickenCoop.addChicken(chicken);
        Assert.assertTrue(chickenCoop.getChickens().contains(chicken));
    }

    @Test
    public void removeChickenTest(){
        Chicken chicken = new Chicken();
        chickenCoop = new ChickenCoop(chicken);
        chickenCoop.removeChicken(chicken);
        Assert.assertFalse(chickenCoop.getChickens().contains(chicken));
    }
}
