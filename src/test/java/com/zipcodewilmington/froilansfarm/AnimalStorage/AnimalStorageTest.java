package com.zipcodewilmington.froilansfarm.AnimalStorage;

import com.zipcodewilmington.froilansfarm.Animal;
import com.zipcodewilmington.froilansfarm.Horse;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalStorageTest {

AnimalStorage storage = new AnimalStorage();

    @Test
    public void addAnimalTest() {
        Animal animal = new Horse();
        storage.add(animal);

        Animal expected = animal;
        Animal actual = storage.get(0);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getAnimalTest() {
        Animal animal = new Horse();
        storage.add(new Horse());
        storage.add(new Horse());
        storage.add(animal);

        Animal expected = animal;
        Animal actual = storage.get(2);


        Assert.assertEquals(expected,actual);

    }

    @Test
    public void removeAnimalTest() {
        Animal animal = new Horse();
        storage.add(new Horse());
        storage.add( new Horse());
        storage.remove();

        Integer expected = 1;
        Integer actual = storage.animalCount();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void animalCountTest() {
        Animal animal= new Horse();
        storage.add(new Horse());
        storage.add( new Horse());
        storage.animalCount();

        Integer expected = 2;
        Integer actual = storage.animalCount();

        Assert.assertEquals(expected, actual);

    }
}