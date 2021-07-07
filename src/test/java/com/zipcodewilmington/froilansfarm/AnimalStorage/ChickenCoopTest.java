package com.zipcodewilmington.froilansfarm.AnimalStorage;

import com.zipcodewilmington.froilansfarm.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {
    ChickenCoop chickencoop = new ChickenCoop();
    private Object Chicken;

    @Test
    public void addChickenTest() {

        //Given:
        Chicken chicken = new Chicken();
        chickencoop.add(chicken);

        //When:
        Chicken expected = chicken;
        Chicken actual = chickencoop.get(0);

        //Then:
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void removeChicken() {
        chickencoop.add(new Chicken());
        chickencoop.add(new Chicken());
        chickencoop.remove();

        Integer expected = 1;
        Integer actual = chickencoop.animalCount();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void chickenCountTest() {
        chickencoop.add(new Chicken());
        chickencoop.add(new Chicken());
        chickencoop.add(new Chicken());
        chickencoop.animalCount();

        Integer expected = 3;
        Integer actual = chickencoop.animalCount();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getChickenTest() {
        Chicken chicken = new Chicken();
        chickencoop.add(new Chicken());
        chickencoop.add(new Chicken());
        chickencoop.add(new Chicken());
        chickencoop.add(chicken);

        Chicken expected = chicken;
        Chicken actual = chickencoop.get(3);

        Assert.assertEquals(expected,actual);
    }



}