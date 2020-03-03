package com.zipcodewilmington.froilansfarm.person;

import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    Pilot pilot = new Pilot("Joe", "Male");

    @Test
    public void instanceTest1() { Assert.assertTrue(pilot instanceof Rider); }

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
