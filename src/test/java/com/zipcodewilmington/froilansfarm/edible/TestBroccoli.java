package com.zipcodewilmington.froilansfarm.edible;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestBroccoli {

    @Test
    public void testToString() {
            //Given
            String toString = new String("Broccoli");
            //When
            String expected = ("Broccoli");
            String actual = toString;
            //Then
            Assert.assertEquals(expected, actual);
    }
}