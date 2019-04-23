package com.zipcodewilmington.froilansfarm.FarmAnimal;

import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest extends Animal {

    Animal animal;
    Animal animal2;
    EarCorn earCorn;

    @Before
    public void setup() {
        animal = new AnimalTest();
        earCorn = new EarCorn();
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(animal instanceof NoiseMaker);
        Assert.assertTrue(animal instanceof Eater);
    }

    @Test
    public void eatTest() {
        animal.eat(earCorn);
        List<Edible> expected = Arrays.asList(earCorn);
        List<Edible> actual = animal.lookInStomach();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseTest() {
        String expected = "Animal sounds";
        String actual = animal.makeNoise();

        Assert.assertEquals(expected, actual);
    }
}