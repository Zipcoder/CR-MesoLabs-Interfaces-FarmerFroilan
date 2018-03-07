package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropDusterTest {

    @Test
    public void fly() {
    }

    @Test
    public void operate() {
    }

    @Test
    public void makeNoise() {
        CropDuster cropDuster = new CropDuster();

        String expected = "cough";
        String actual = cropDuster.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mount() {
        CropDuster cropDuster = new CropDuster();
        cropDuster.mount();

//        boolean expected = true;
//        boolean actual = cropDuster.mount();
//
//        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismount() {
    }
}