package com.zipcodewilmington.froilansfarm.crops;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCornStalk {
    @Test
    public void TestCornStalk(){
        //Given
        String toString = new String("Corn Stalk");
        //When
        String expected = ("Corn Stalk");
        String actual = toString;
        //Then
        Assert.assertEquals(expected, actual);


    }

}
