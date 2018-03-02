package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.Plants.Crop;
import com.zipcodewilmington.froilansfarm.Plants.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void makeNoiseTest() {
        Tractor vehicle = new Tractor();
        String expected = "Awooga";
        String actual = vehicle.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIsMounted() {
        Tractor vehicle = new Tractor();
        Assert.assertTrue(!(vehicle.getIsMounted()));
    }

    @Test
    public void isMountableTest() {
        Tractor vehicle = new Tractor();
        Farmer farmer = new Farmer("Bob");
        farmer.mount(vehicle);
        Assert.assertTrue(vehicle.getIsMounted());
    }

    @Test
    public void canBeDismountedTest() {
        Tractor vehicle = new Tractor();
        Farmer farmer = new Farmer("Steve");
        farmer.mount(vehicle);
        farmer.dismount(vehicle);
        Assert.assertTrue(!(vehicle.getIsMounted()));
    }

    @Test
    public void fertilizeCropTest() {
        Tractor vehicle = new Tractor();
        Crop crop = new TomatoPlant();
        vehicle.fertilize(crop);
        Assert.assertTrue(crop.isFertilized());
    }

}
