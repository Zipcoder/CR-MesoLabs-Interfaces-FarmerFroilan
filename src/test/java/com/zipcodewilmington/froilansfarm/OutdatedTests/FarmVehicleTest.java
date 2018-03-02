// Tests temporarily noted out because FarmVehicle was changed from a class to an interface

/*
package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;
import org.junit.Assert;
import org.junit.Test;

public class FarmVehicleTest {

    @Test
    public void makeNoiseTest() {
        FarmVehicle vehicle = new FarmVehicle();
        String expected = "Vroom";
        String actual = vehicle.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIsMounted() {
        FarmVehicle vehicle = new FarmVehicle();
        Assert.assertTrue(!(vehicle.getIsMounted()));
    }

    @Test
    public void isMountableTest() {
        FarmVehicle vehicle = new FarmVehicle();
        Farmer farmer = new Farmer("Bob");
        farmer.mount(vehicle);
        Assert.assertTrue(vehicle.getIsMounted());
    }

    @Test
    public void canBeDismountedTest() {
        FarmVehicle vehicle = new FarmVehicle();
        Farmer farmer = new Farmer("Steve");
        farmer.mount(vehicle);
        farmer.dismount(vehicle);
        Assert.assertTrue(!(vehicle.getIsMounted()));
    }

}
*/
