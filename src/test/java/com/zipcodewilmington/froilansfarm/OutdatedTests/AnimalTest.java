package com.zipcodewilmington.froilansfarm.OutdatedTests;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.Plants.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void animalEatsFood() {
        Horse animal = new Horse();
        Farmer farmer = new Farmer("Farmer");
        farmer.getFoodInventory().add(new Tomato());
        animal.eat(farmer.getFoodInventory().remove(0));
        Assert.assertEquals(farmer.getFoodInventory().size(), 0);
    }
    // Once food is removed from inventory ArrayList, it is in custody of animal
}
