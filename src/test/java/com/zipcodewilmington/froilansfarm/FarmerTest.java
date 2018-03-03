package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Buildings.Stable;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.Plants.Crop;
import com.zipcodewilmington.froilansfarm.Plants.CropRow;
import com.zipcodewilmington.froilansfarm.Plants.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void getAndSetNameTest() {
        Farmer farmer = new Farmer("Original name");
        Assert.assertEquals(farmer.getName(), "Original name");
        farmer.setName("New name");
        Assert.assertEquals(farmer.getName(), "New name");
    }

    @Test
    public void makeNoiseTest() {
        Farmer farmer = new Farmer("Bob");
        Assert.assertEquals("Howdy", farmer.makeNoise());
    }

    @Test
    public void canMountTest() {
        Farmer farmer = new Farmer("Froilan");
        Horse horse = new Horse();
        farmer.mount(horse);
        Assert.assertTrue(farmer.isCurrentlyRidingSomething());
    }

    @Test
    public void canDismountTest() {
        Farmer farmer = new Farmer("Froilan");
        Horse horse = new Horse();
        farmer.mount(horse);
        farmer.dismount();
        Assert.assertTrue(!(farmer.isCurrentlyRidingSomething()));
    }

    @Test
    public void plantTest() {
        Farmer farmer = new Farmer("Someone");
        CropRow cropRow = new CropRow();
        farmer.plant(new TomatoPlant(), cropRow);
        Crop expected = new TomatoPlant();
        Crop actual = cropRow.getCropArrayList().get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fertilizeOnVehicleTest() {
        Farmer farmer = new Farmer("Farmer Dan");
        TomatoPlant tomatoPlant = new TomatoPlant();
        Tractor tractor = new Tractor();
        farmer.mount(tractor);
        String expected = farmer.fertilizeOnVehicle(tomatoPlant);
        Assert.assertEquals(expected, "Crop fertilized!");
        Assert.assertTrue(tomatoPlant.isFertilized());
    }

    @Test
    public void cannotFertilizeWithoutVehicleTest() {
        Farmer farmer = new Farmer("Farmer Dan");
        TomatoPlant tomatoPlant = new TomatoPlant();
        String expected = farmer.fertilizeOnVehicle(tomatoPlant);
        Assert.assertEquals(expected, "Dude where's my tractor?");
    }

    @Test
    public void exerciseHorseTest() {
        Farmer farmer = new Farmer("Uh");
        Horse horse = new Horse();
        farmer.mount(horse);
        horse.gallop();
        farmer.dismount();
        Assert.assertTrue(horse.isDailyExercise());
    }

    @Test
    public void exerciseEntireStableTest() {
        Farmer farmer = new Farmer("Dat boi");
        Stable stable = new Stable();
        stable.addHorse(new Horse());
        stable.addHorse(new Horse());
        stable.addHorse(new Horse());
        farmer.exerciseHorses(stable);
        for (int i = 0; i < stable.getHorses().size(); i++) {
            Assert.assertTrue(stable.getHorses().get(i).isDailyExercise());
        }
    }

}
