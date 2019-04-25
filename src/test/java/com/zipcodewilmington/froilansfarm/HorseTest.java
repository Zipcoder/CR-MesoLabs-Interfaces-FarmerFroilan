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
        farmer.dismount();
        Assert.assertTrue(!(farmer.isCurrentlyRidingSomething()));
    }

    @Test
    public void hasntExercisedYetTest() {
        Horse horse = new Horse();
        Assert.assertFalse(horse.isDailyExercise());
    }

    @Test
    public void gallopTest() {
        Farmer farmer = new Farmer("Theresa");
        Horse horse = new Horse();
        farmer.mount(horse);
        horse.gallop();
        farmer.dismount();
        Assert.assertTrue(horse.isDailyExercise());
    }

}
