package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.Vehicles.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void makeNoiseTest() {
        Vehicle vehicle = new Vehicle();
        String expected = "Vroom";
        String actual = vehicle.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIsMounted() {
        Vehicle vehicle = new Vehicle();
        Assert.assertTrue(!(vehicle.getIsMounted()));
    }

    @Test
    public void isMountableTest() {
        Vehicle vehicle = new Vehicle();
        Farmer farmer = new Farmer("Bob");
        farmer.mount(vehicle);
        Assert.assertTrue(vehicle.getIsMounted());
    }

    @Test
    public void canBeDismountedTest() {
        Vehicle vehicle = new Vehicle();
        Farmer farmer = new Farmer("Steve");
        farmer.mount(vehicle);
        farmer.dismount(vehicle);
        Assert.assertTrue(!(vehicle.getIsMounted()));
    }

}
