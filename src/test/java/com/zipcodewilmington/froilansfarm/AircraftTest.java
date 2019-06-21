package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;

import static org.junit.Assert.*;

public class AircraftTest {
Aircraft aircraft=new Aircraft();

    @org.junit.Test
    public void isFarmVehicle() {
        Assert.assertTrue(aircraft.isFarmVehicle());
    }

    @org.junit.Test
    public void canFy() {
        Assert.assertTrue(aircraft.canFly());
    }

    @org.junit.Test
    public void vehicleRideable() {
        Assert.assertTrue(aircraft.vehicleRideable());
    }

    @org.junit.Test
    public void isDriveable() {
        Assert.assertTrue(aircraft.isDriveable());
    }

    @org.junit.Test
    public void operate() {
        Assert.assertTrue(aircraft.operate());

    }

    @org.junit.Test
    public void makesNoise() {
        Assert.assertTrue(aircraft.makesNoise());
    }
}