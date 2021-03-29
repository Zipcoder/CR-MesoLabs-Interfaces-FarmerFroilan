package com.zipcodewilmington.froilansfarm.edible;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCorn {
    @Test
    public void TestCorn(){
        //Given
        String toString = new String("Corn");
        //When
        String expected = ("Corn");
        String actual = toString;
        //Then
        Assert.assertEquals(expected, actual);


    }

}
