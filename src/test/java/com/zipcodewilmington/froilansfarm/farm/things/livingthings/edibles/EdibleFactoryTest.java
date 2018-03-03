package com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles;

import org.junit.Assert;
import org.junit.Test;

public class EdibleFactoryTest {

    @Test
    public void createEggTest(){
        //Given

        //When

        //Then
        Assert.assertTrue(EdibleFactory.createEdible(EdibleType.EGG) instanceof Egg);
    }

    @Test
    public void Hay(){
        //Given

        //When

        //Then
        Assert.assertTrue(EdibleFactory.createEdible(EdibleType.HAY) instanceof Hay);
    }

    @Test
    public void createChickenFeedTest(){
        //Given

        //When

        //Then
        Assert.assertTrue(EdibleFactory.createEdible(EdibleType.CHICKENFEED) instanceof ChickenFeed);
    }

    @Test
    public void createEarCornTest(){
        //Given

        //When

        //Then
        Assert.assertTrue(EdibleFactory.createEdible(EdibleType.EARCORN) instanceof EarCorn);
    }

    @Test
    public void createTomatoTest(){
        //Given

        //When

        //Then
        Assert.assertTrue(EdibleFactory.createEdible(EdibleType.TOMATO) instanceof Tomato);
    }

    @Test
    public void createVegetableTest(){
        //Given

        //When

        //Then
        Assert.assertTrue(EdibleFactory.createEdible(EdibleType.VEGETABLE) instanceof Vegetable);
    }



}
