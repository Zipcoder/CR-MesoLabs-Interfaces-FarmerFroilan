package com.zipcodewilmington.froilansfarm.TestVehicles;

import com.zipcodewilmington.froilansfarm.Vehicles.*;
import org.junit.Assert;
import org.junit.Test;

public class TestTractor {
    @Test
    public void testInheritanceFarmVehicle(){
        //Arrange
        Tractor tractor = new Tractor();

        //Assertion
        Assert.assertTrue(tractor instanceof FarmVehicle);
    }
    @Test
    public void testImplementsVehicle(){
        //Arrange
        Tractor tractor = new Tractor();

        //Assertion
        Assert.assertTrue(tractor instanceof Vehicle);
    }
    @Test
    public void testMakeNoise(){
        //Arrange
        Tractor tractor = new Tractor();;

        //Action
        String expected = "NnNnNn";
        String actual = tractor.makeNoise();

        //Assertion
        Assert.assertEquals(expected,actual);
    }
}
