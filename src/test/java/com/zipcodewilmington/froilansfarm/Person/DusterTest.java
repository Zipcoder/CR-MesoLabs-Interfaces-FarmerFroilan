package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Vehicle.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/3/18
 */
public class DusterTest {
    private Aircraft aircraft;
    private Duster duster;

    @Before
    public void setup() {
        aircraft = new CropDuster();
        duster = new Duster("rin", 10);
    }

    @Test
    public void testFly() {
        duster.fly(aircraft);
        Assert.assertNotNull(aircraft.getPilot());
    }

}