package com.zipcodewilmington.froilansfarm.edible;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EggTest {

    @Test
    public void EggTest(){
        //Given
        String toString = new String("Egg");
        //When
        String expected = ("Egg");
        String actual = toString;
        //Then
        Assert.assertEquals(expected, actual);


    }

}