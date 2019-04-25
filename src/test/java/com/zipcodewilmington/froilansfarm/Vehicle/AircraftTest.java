package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Exceptions.NoPilotException;
import com.zipcodewilmington.froilansfarm.Person.Duster;
import com.zipcodewilmington.froilansfarm.interfaces.Pilot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/3/18
 */
public class AircraftTest {
    Pilot pilot;
    Aircraft dummy;

    @Before
    public void setup() {
        pilot = new Duster("rin", 10);
        dummy = new AircraftDummy();
    }

    @Test
    public void testTakeOff() {
        Assert.assertNull(dummy.getPilot());
        dummy.takeOff(pilot);
        Assert.assertNotNull(dummy.getPilot());
    }

    @Test
    public void testLand() {
        Assert.assertNull(dummy.getPilot());
        dummy.takeOff(pilot);
        Assert.assertNotNull(dummy.getPilot());
        dummy.land();
        Assert.assertNull(dummy.getPilot());
    }

    @Test
    public void testConfirmPilotSuccess() {
        pilot.fly(dummy);
        try {
            dummy.confirmDriver();
        } catch (NoPilotException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testConfirmPilotNoDriverFail() {
        try {
            dummy.confirmDriver();
            Assert.fail();
        } catch (NoPilotException e) {
            e.printStackTrace();
        }
    }

    private class AircraftDummy extends Aircraft {
    }
}