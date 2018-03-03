package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void makeNoiseTest() {
        Horse horse = new Horse();
        Assert.assertEquals("Neigh or something", horse.makeNoise());
    }

    @Test
    public void mountTest() {
        Farmer farmer = new Farmer("Someone");
        Horse horse = new Horse();
        farmer.mount(horse);
        Assert.assertTrue(farmer.isCurrentlyRidingSomething());
    }

    @Test
    public void dismountTest() {
        Farmer farmer = new Farmer("Someone");
        Horse horse = new Horse();
        farmer.mount(horse);
        farmer.dismount(horse);
        Assert.assertTrue(!(farmer.isCurrentlyRidingSomething()));
    }

}
