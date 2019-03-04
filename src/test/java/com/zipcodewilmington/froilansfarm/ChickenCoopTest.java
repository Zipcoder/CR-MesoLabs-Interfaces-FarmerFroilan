package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ChickenCoopTest {

    @Test
    public void addChicken() {

        ChickenCoop chickenCoop = new ChickenCoop();
        ArrayList<Chicken> chickens = new ArrayList<Chicken>();
        chickenCoop.setChickens(chickens);

        chickenCoop.addChicken(new Chicken(true));
        chickenCoop.addChicken(new Chicken(true));
        chickenCoop.addChicken(new Chicken(true));

        int expected = 3;
        int actual = chickens.size();

        Assert.assertEquals(expected,actual);


    }

    @Test
    public void setChickens() {
        ChickenCoop chickenCoop = new ChickenCoop();
        ArrayList<Chicken> chickens = new ArrayList<Chicken>();
        chickenCoop.setChickens(chickens);

        chickenCoop.addChicken(new Chicken(true));
        chickenCoop.addChicken(new Chicken(true));
        chickenCoop.addChicken(new Chicken(true));
        chickenCoop.addChicken(new Chicken(true));
        chickenCoop.addChicken(new Chicken(true));
        chickenCoop.addChicken(new Chicken(true));

        int expected = 6;
        int actual = chickenCoop.getChickens().size();

        Assert.assertEquals(expected,actual);

    }
}