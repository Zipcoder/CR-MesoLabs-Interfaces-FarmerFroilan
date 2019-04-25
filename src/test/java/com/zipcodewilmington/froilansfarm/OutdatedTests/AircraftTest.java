// Functionality transferred to cropduster tests

/*
package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.AirCraft;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class AircraftTest {

    @Test
    public void makeNoiseTest() {
        AirCraft vehicle = new CropDuster();
        String expected = "Brrrrrrr";
        String actual = vehicle.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIsMounted() {
        AirCraft vehicle = new CropDuster();
        Assert.assertTrue(!(vehicle.getIsMounted()));
    }

    @Test
    public void isMountableTest() {
        AirCraft vehicle = new CropDuster();
        Farmer farmer = new Farmer("Bob");
        farmer.mount(vehicle);
        Assert.assertTrue(vehicle.getIsMounted());
    }

    @Test
    public void canBeDismountedTest() {
        AirCraft vehicle = new CropDuster();
        Farmer farmer = new Farmer("Steve");
        farmer.mount(vehicle);
        farmer.dismount(vehicle);
        Assert.assertTrue(!(vehicle.getIsMounted()));
    }

    @Test
    public void canTakeOffTest() {
        AirCraft airCraft = new CropDuster();
        Pilot pilot = new Pilot("Kevin");
        pilot.mount(airCraft);
        pilot.takeOff(airCraft);
        Assert.assertTrue(airCraft.inTheAir);
    }

    @Test
    public void canLandTest() {
        AirCraft airCraft = new CropDuster();
        Pilot pilot = new Pilot("Kevin");
        pilot.mount(airCraft);
        pilot.takeOff(airCraft);
        pilot.land(airCraft);
        Assert.assertTrue(!(airCraft.inTheAir));
    }

}
*/