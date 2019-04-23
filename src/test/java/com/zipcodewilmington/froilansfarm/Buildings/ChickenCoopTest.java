package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.FarmAnimal.Chicken;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ChickenCoopTest {

    ChickenCoop chickenCoop;
    Chicken chicken1;
    Chicken chicken2;

    @Before
    public void setup() {
        chickenCoop = new ChickenCoop();
        chicken1 = new Chicken();
        chicken2 = new Chicken();
    }

    @Test
    public void getChickensTest() {
        chickenCoop.addChicken(chicken1);
        chickenCoop.addChicken(chicken2);

        List<Chicken> expected = Arrays.asList(chicken1, chicken2);
        List<Chicken> actual = chickenCoop.getChickens();

        Assert.assertEquals(expected, actual);
    }
}