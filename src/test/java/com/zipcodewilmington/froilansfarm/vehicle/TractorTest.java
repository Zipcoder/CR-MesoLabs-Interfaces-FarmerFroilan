package com.zipcodewilmington.froilansfarm.vehicle;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TractorTest {

    @Test
    public void tractorTest(){
        Tractor tractor = new Tractor("Big Red");
        String expected = "Big Red";

        String actual = tractor.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tractorTest2(){
        Tractor tractor = new Tractor("Big Red");
        String expected = "Big Blue";

        String actual = tractor.getName();

        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void tractorMakeNoiseTest(){
        Tractor tractor = new Tractor("Big Red");
        String expected = "Putt putt putt Bang";

        String actual = tractor.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tractorMakeNoiseTest2(){
        Tractor tractor = new Tractor("Big Red");
        String expected = "some tractor noise";

        String actual = tractor.getName();

        Assert.assertNotEquals(expected, actual);
    }

}