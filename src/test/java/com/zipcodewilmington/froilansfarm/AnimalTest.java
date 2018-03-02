package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Plants.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void animalEatsFood() {
        Animal animal = new Animal();
        Tomato tomato = new Tomato();
        animal.eat(tomato);
        Assert.assertNotNull(tomato);
    }

}
