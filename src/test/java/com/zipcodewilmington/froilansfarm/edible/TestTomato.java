package com.zipcodewilmington.froilansfarm.edible;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTomato {
    @Test
    public void TestTomato(){
        //Given
        String toString = new String("Tomato");
        //When
        String expected = ("Tomato");
        String actual = toString;
        //Then
        Assert.assertEquals(expected, actual);


    }

}

