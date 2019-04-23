package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Crops.Banana;
import com.zipcodewilmington.froilansfarm.Crops.Tomato;
import com.zipcodewilmington.froilansfarm.FarmAnimal.Horse;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PersonTest extends Person {

    Person person;
    Banana banana;
    Tomato tomato;
    Horse horse;

    @Before
    public void setup() {
        person = new PersonTest();
        banana = new Banana();
        tomato = new Tomato();
        horse = new Horse();
    }

    @Test
    public void eatTest() {
        person.eat(banana);
        person.eat(tomato);

        List<Edible> expected = Arrays.asList(banana, tomato);
        List<Edible> actual = person.lookInStomach();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseTest() {
        String expected = "People sounds";
        String actual = person.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rideTest() {
        person.rideHorse(horse);

        Assert.assertTrue(horse.getHasBeenRidden());
    }

}