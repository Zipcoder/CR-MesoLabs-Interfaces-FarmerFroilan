package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.Crops.Banana;
import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import com.zipcodewilmington.froilansfarm.Crops.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StorageTest {

    Storage storage;
    Tomato tomato;
    Tomato tomato2;
    Banana banana;
    Banana banana2;
    EarCorn corn;
    EarCorn corn2;

    @Before
    public void setup() {
        storage = new Storage();
        tomato = new Tomato();
        tomato2 = new Tomato();
        banana = new Banana();
        banana2 = new Banana();
        corn = new EarCorn();
        corn2 = new EarCorn();
    }

    @Test
    public void addToCornStorageTest() {
        storage.addToCornCache(corn);
        storage.addToCornCache(corn2);

        List<Edible> expected = Arrays.asList(corn, corn2);
        List<Edible> actual = storage.getCornCache();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addToTomatoStorageTest() {
        storage.addToTomatoCache(tomato);
        storage.addToTomatoCache(tomato2);

        List<Edible> expected = Arrays.asList(tomato, tomato2);
        List<Edible> actual = storage.getTomatoCache();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addToBananaStorageTest() {
        storage.addToBananaCache(banana);
        storage.addToBananaCache(banana2);

        List<Edible> expected = Arrays.asList(banana, banana2);
        List<Edible> actual = storage.getBananaCache();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void takeTomatosFromCacheTest() {
        storage.addToTomatoCache(tomato);
        storage.addToTomatoCache(tomato2);

        storage.takeTomatosFromCache(2);

        boolean expected = true;
        boolean actual = storage.getTomatoCache().isEmpty();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void takeBananasFromCacheTest() {
        storage.addToBananaCache(banana);
        storage.addToBananaCache(banana2);

        storage.takeBananasFromCache(2);

        boolean expected = true;
        boolean actual = storage.getBananaCache().isEmpty();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void takeCornFromCacheTest() {
        storage.addToCornCache(corn);
        storage.addToCornCache(corn2);

        storage.takeCornFromCache(2);

        boolean expected = true;
        boolean actual = storage.getBananaCache().isEmpty();

        Assert.assertEquals(expected, actual);
    }

}