package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Exceptions.NoDriverException;
import com.zipcodewilmington.froilansfarm.Exceptions.NoPilotException;
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
    private Rider rider;
    private class VehicleDummy extends Vehicle {
        public void makeNoise() {}
    }

    @Before
    public void setup() {
        dummy = new VehicleDummy();
        rider = new Farmer("rin", 10);
    }

    @Test
    public void startRide() {
        Assert.assertNull(dummy.getRider());
        dummy.startRide(rider);
        Assert.assertNotNull(dummy.getRider());
    }

    @Test
    public void stopRide() {
        Assert.assertNull(dummy.getRider());
        dummy.startRide(rider);
        Assert.assertNotNull(dummy.getRider());
        dummy.stopRide();
        Assert.assertNull(dummy.getRider());
    }

    @Test
    public void testConfirmDriverSuccess() {
        rider.mount(dummy);
        try {
            dummy.confirmDriver();
        } catch (NoDriverException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testConfirmDriverFail() {
        try {
            dummy.confirmDriver();
            Assert.fail();
        } catch (NoDriverException e) {
            e.printStackTrace();
        }
    }
}