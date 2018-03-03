package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Crops.Banana;
import com.zipcodewilmington.froilansfarm.Crops.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PersonTest {

    Person person;
    Banana banana;
    Tomato tomato;

    @Before
    public void setup() {
        person = new Person();
        banana = new Banana();
        tomato = new Tomato();
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

}