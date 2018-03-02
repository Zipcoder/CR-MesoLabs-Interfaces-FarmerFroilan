package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Plants.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void animalEatsFood() {
        Horse animal = new Horse();
        Tomato tomato = new Tomato();
        animal.eat(tomato);
        Assert.assertEquals(null, tomato);
    }
    // Once food is removed from inventory ArrayList, it is in custody of animal
}
