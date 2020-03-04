package com.zipcodewilmington.froilansfarm.vehiclestest;

import com.zipcodewilmington.froilansfarm.vehicles.FarmVehicle;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import com.zipcodewilmington.froilansfarm.vehicles.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void instanceOfVehicleTest(){
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Vehicle);
        Assert.assertTrue(tractor instanceof FarmVehicle);
    }
    @Test
    public void makeNoiseTest(){
        Tractor tractor = new Tractor();
        String expected = "KlunkaKlunka";
        String actual = tractor.makeNoise();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void operateTest(){
        Tractor tractor = new Tractor();


        Assert.assertTrue(tractor instanceof Vehicle);

    }
    @Test
    public void rideTest(){
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor.ride());

    }
    @Test
    public void stopRidingTest(){
        Tractor tractor = new Tractor();
        tractor.ride();
        Assert.assertTrue(tractor.stopRiding());

    }
}
