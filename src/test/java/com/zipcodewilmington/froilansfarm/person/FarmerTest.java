package com.zipcodewilmington.froilansfarm.person;


import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    Farmer farmer = new Farmer("joe", "Female");

    @Test
    public void instanceTest1() { Assert.assertTrue(farmer instanceof Botanist); }

    @Test
    public void instanceTest2() { Assert.assertTrue(farmer instanceof Rider); }

    @Test
    public void plants() {

    }

    @Test
    public void mount() {
    }

    @Test
    public void dismount() {
    }

    @Test
    public void ride() {
    }
}
