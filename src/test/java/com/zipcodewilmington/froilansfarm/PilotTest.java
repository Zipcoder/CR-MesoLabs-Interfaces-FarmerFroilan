package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.AirCraft;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    @Test
    public void makeNoiseTest() {
        Pilot pilot = new Pilot("Amelia");
        Assert.assertEquals("I'm a pilot", pilot.makeNoise());
    }

    @Test
    public void mountAircraftTest() {
        Pilot pilot = new Pilot("Someone");
        AirCraft airCraft = new CropDuster();
        pilot.mount(airCraft);
        Assert.assertTrue(pilot.isCurrentlyRidingSomething());
    }

    @Test
    public void dismountAircraftTest() {
        Pilot pilot = new Pilot("Someone");
        AirCraft airCraft = new CropDuster();
        pilot.mount(airCraft);
        pilot.dismount(airCraft);
        Assert.assertTrue(!(pilot.isCurrentlyRidingSomething()));
    }

}
