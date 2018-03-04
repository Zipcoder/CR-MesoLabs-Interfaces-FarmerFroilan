package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Food.*;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/4/18
 */
public class FoodStoreTest {
    private FoodStore store;
    @Before
    public void setup() {
        store = new FoodStore();
    }

    @Test
    public void getManyFoodSuccess() {
        store.storeFood(new Egg());
        store.storeFood(new Egg());

        int eggspected = 2;
        List<Edible> eggs = store.getFood("egg", eggspected);

        int actual = eggs.size();

        Assert.assertEquals(eggspected, actual);
    }

    @Test
    public void getManyFoodNotEnoughStock() {
        store.storeFood(new Pepper());
        int expected = 1;
        int actual = store.getFood("pepper", 2).size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFoodStockEmpty() {
        int expected = 0;
        int actual = store.getFood("pepper", 2).size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replicateFood() {
        int expected = 3;
        int actual = store.replicateFood("pepper", expected).size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void storeFoodNewType() {
        Tomato tomato = new Tomato();
        store.storeFood(tomato);

        Edible food = store.getFood("tomato", 1).get(0);
        System.out.println(food.getClass().getSimpleName());
    }

    @Test
    public void storeFoodTypeAlreadyPresent() {

    }

    @Test
    public void getKey() {
        Egg egg = new Egg();
        String eggspected = "EGG";
        String actual = store.getKey(egg);

        Assert.assertEquals(eggspected, actual);
    }

    @Test
    public void getAvailableEmptyList() {
        int expected = 0;
        int actual = store.getFood("tomato", 6).size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAvailableRequestMoreThanInStock() {
        store.storeFood(new Pepper());
        int expected = 1;
        int actual = store.getFood("pepper", 2).size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAvailableRequestFewerThanInStock() {
        store.storeFood(new Tomato());
        store.storeFood(new Tomato());
        store.storeFood(new Tomato());

        int expected = 2;
        int actual = store.getFood("tomato", expected).size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeStock() {
        store.storeFood(new Tomato());
        store.storeFood(new Tomato());
        store.storeFood(new Tomato());

        int expected = 1;
        store.removeStock("TOMATO", 2);

        int actual = store.getFood("tomato", 2).size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetTotalStamina() {
        store.storeFood(new Tomato());
        store.storeFood(new Egg());
        store.storeFood(new Pepper());
        store.storeFood(new EarCorn());
        store.storeFood(new Egg());
        store.storeFood(new Pepper());
        store.storeFood(new Pepper());

        int expected = 13;
        int actual = store.getTotalStamina();

        Assert.assertEquals(expected, actual);
    }
}