package com.zipcodewilmington.froilansfarm.HousingTest;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Farm.Housing;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {
    Chicken chicken = new Chicken();

    @Test
    public void coopSizeOne() {
        //Given
        ChickenCoop chickenCoop = new ChickenCoop(4, chicken);
        int expected = 4;

        //When
        int actual = chickenCoop.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void coopSizeTwo() {
        //Given
        ChickenCoop chickenCoop = new ChickenCoop(12, chicken);
        int expected = 12;

        //When
        int actual = chickenCoop.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addChickenOne() {
        //Given
        ChickenCoop chickenCoop = new ChickenCoop(12, chicken);
        chickenCoop.store(chicken);
        int expected = 13;

        //When
        int actual = chickenCoop.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeChicken() {
        //Given
        ChickenCoop chickenCoop = new ChickenCoop(12, chicken);
        chickenCoop.killChicken(chicken);
        int expected = 11;

        //When
        int actual = chickenCoop.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inheritance() {
        //Given
        ChickenCoop chickenCoop = new ChickenCoop();

        //Then
        Assert.assertTrue(chickenCoop instanceof Housing);
    }
}
