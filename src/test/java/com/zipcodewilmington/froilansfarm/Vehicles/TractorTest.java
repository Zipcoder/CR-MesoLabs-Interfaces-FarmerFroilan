package com.zipcodewilmington.froilansfarm.Vehicles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class TractorTest {

    Tractor testTractor;

    @Before
    public void setUp(){
        testTractor = new Tractor();
    }
    @Test
    public void testNoise(){
        String actual = testTractor.makeNoise();
        String expected = "Chuga chuga";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void rideTest(){

    }
}
