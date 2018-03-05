package com.zipcodewilmington.froilansfarm.Animal;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {

    @Test
    public void UnFertilizedChickenYieldTest(){
        //Given
        Chicken chickenTest = new Chicken();
        chickenTest.setHasBeenFertilized(false);

        //When
        String expected = "EdibleEgg";
        String actual = chickenTest.yields().getClass().getSimpleName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ChickenSpeakTest(){
        //Given
        Chicken chickenTest = new Chicken();

        //When
        String expected = "Cluckooo!";
        String actual = chickenTest.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);

    }

}