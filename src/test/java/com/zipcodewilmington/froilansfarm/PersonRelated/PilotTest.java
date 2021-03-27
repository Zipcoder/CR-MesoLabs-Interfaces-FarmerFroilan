package com.zipcodewilmington.froilansfarm.PersonRelated;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.VehicleRelated.Aircraft;
import com.zipcodewilmington.froilansfarm.VehicleRelated.CropDuster;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {

    private Aircraft rideable;


    @Test
    public void eat() {
        Pilot pilot = new Pilot();
        Edible food = new Tomato();

    }

    @Test
    public void makeNoise() {
        Pilot pilot = new Pilot();
        String actual = pilot.makeNoise();
        Assert.assertEquals("noise",actual);
    }

    @Test
    public void eat1() {
    }

    @Test
    public void fly() {
        Pilot pilot = new Pilot();
        pilot.fly(rideable);
        Boolean actual = ((CropDuster) rideable).fly();
        assertTrue(actual);
    }
}