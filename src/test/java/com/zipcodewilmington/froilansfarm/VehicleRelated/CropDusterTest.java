package com.zipcodewilmington.froilansfarm.VehicleRelated;

import org.junit.Test;

import static org.junit.Assert.*;

public class CropDusterTest {

    @Test
    public void fly() {
        CropDuster dust = new CropDuster();

        assertFalse(dust.getClass());

        dust.fly();

        assertTrue(dust.getClass());

    }


    @Test
    public void makenoise() {
        CropDuster dusty = new CropDuster();
        String expected = "vooooom";

        assertEquals(expected, dusty.makeNoise());
    }


    private void assertTrue(Class<? extends CropDuster> aClass) {

    }

    private void assertFalse(Class<? extends CropDuster> aClass) {

    }

}

