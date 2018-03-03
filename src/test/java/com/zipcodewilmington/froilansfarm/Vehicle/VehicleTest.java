package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/3/18
 */
public class VehicleTest {
    private VehicleDummy dummy;
    private class VehicleDummy extends Vehicle {
        public void makeNoise() {}
    }

    @Before
    public void setup() {
        dummy = new VehicleDummy();
    }

    @Test
    public void startRide() {
        Rider rider = new Farmer("rin", 10);
        Assert.assertNull(dummy.getRider());
        dummy.startRide(rider);
        Assert.assertNotNull(dummy.getRider());
    }

    @Test
    public void stopRide() {
        Rider rider = new Farmer("rin", 10);
        Assert.assertNull(dummy.getRider());
        dummy.startRide(rider);
        Assert.assertNotNull(dummy.getRider());
        dummy.stopRide();
        Assert.assertNull(dummy.getRider());
    }
}