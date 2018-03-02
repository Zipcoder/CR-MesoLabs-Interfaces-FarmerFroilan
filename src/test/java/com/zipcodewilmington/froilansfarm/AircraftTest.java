package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.AirCraft;
import org.junit.Assert;
import org.junit.Test;

public class AircraftTest {

    @Test
    public void makeNoiseTest() {
        AirCraft vehicle = new AirCraft();
        String expected = "Brrrrrrr";
        String actual = vehicle.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIsMounted() {
        AirCraft vehicle = new AirCraft();
        Assert.assertTrue(!(vehicle.getIsMounted()));
    }

    @Test
    public void isMountableTest() {
        AirCraft vehicle = new AirCraft();
        Farmer farmer = new Farmer("Bob");
        farmer.mount(vehicle);
        Assert.assertTrue(vehicle.getIsMounted());
    }

    @Test
    public void canBeDismountedTest() {
        AirCraft vehicle = new AirCraft();
        Farmer farmer = new Farmer("Steve");
        farmer.mount(vehicle);
        farmer.dismount(vehicle);
        Assert.assertTrue(!(vehicle.getIsMounted()));
    }

    @Test
    public void canTakeOffTest() {
        AirCraft airCraft = new AirCraft();
        Pilot pilot = new Pilot("Kevin");
        pilot.mount(airCraft);
        pilot.takeOff(airCraft);
        Assert.assertTrue(airCraft.inTheAir);
    }

    @Test
    public void canLandTest() {
        AirCraft airCraft = new AirCraft();
        Pilot pilot = new Pilot("Kevin");
        pilot.mount(airCraft);
        pilot.takeOff(airCraft);
        pilot.land(airCraft);
        Assert.assertTrue(!(airCraft.inTheAir));
    }

}
