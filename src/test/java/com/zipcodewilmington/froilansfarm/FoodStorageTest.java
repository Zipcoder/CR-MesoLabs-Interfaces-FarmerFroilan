package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Produce.Cucumber;
import com.zipcodewilmington.froilansfarm.Produce.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Produce.Tomato;
import com.zipcodewilmington.froilansfarm.Produce.Tomatoes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FoodStorageTest {

    @Test
    public void add() {
       FoodStorage foodStorage=new FoodStorage();
        Tomato tomato=new Tomato();
       foodStorage.add(tomato);
        Assert.assertEquals(1, foodStorage.itemCount(),0.0001);
    }
    @Test
    public void add1() {
        FoodStorage foodStorage=new FoodStorage();
        Cucumber cucumber=new Cucumber();
        foodStorage.add(cucumber);
        foodStorage.add(cucumber);
        Assert.assertEquals(2, foodStorage.itemCount(),0.0001);
    }
    @Test
    public void add2() {
        FoodStorage foodStorage=new FoodStorage();
        Tomato tomato=new Tomato();
        Cucumber cucumber=new Cucumber();
        foodStorage.add(cucumber);
        foodStorage.add(cucumber);
        foodStorage.add(tomato);
        Assert.assertEquals(3, foodStorage.itemCount(),0.0001);
    }
    @Test
    public void retrieve() {
        FoodStorage foodStorage=new FoodStorage();
        Tomato tomato=new Tomato();
        Cucumber cucumber=new Cucumber();
        foodStorage.add(tomato);
        foodStorage.add(cucumber);
        foodStorage.add(cucumber);
        foodStorage.retrieve(tomato);
        Assert.assertEquals(2, foodStorage.itemCount(),0.0001);
    }
    @Test
    public void retrieve1() {
        FoodStorage foodStorage=new FoodStorage();
        Cucumber cucumber=new Cucumber();
        foodStorage.add(cucumber);
        foodStorage.add(cucumber);
        foodStorage.retrieve(cucumber);
        Assert.assertEquals(1, foodStorage.itemCount(),0.0001);
    }
    @Test
    public void retrieve2() {
        FoodStorage foodStorage=new FoodStorage();
        Tomato tomato=new Tomato();
        Cucumber cucumber=new Cucumber();
        EarOfCorn corn=new EarOfCorn();
        foodStorage.add(cucumber);
        foodStorage.add(corn);
        foodStorage.add(corn);
        foodStorage.retrieve(corn);
        Assert.assertEquals(2, foodStorage.itemCount(),0.0001);
    }
    @Test
    public void isEmpty() {
        FoodStorage foodStorage=new FoodStorage();
        Tomato tomato=new Tomato();
        Cucumber cucumber=new Cucumber();
        EarOfCorn corn=new EarOfCorn();
        foodStorage.add(cucumber);
        foodStorage.add(corn);
        foodStorage.add(corn);
        foodStorage.retrieve(corn);
        Assert.assertFalse(foodStorage.isEmpty());
    }

    @Test
    public void isEmpty1() {
        FoodStorage foodStorage = new FoodStorage();
        Cucumber cucumber = new Cucumber();
        foodStorage.add(cucumber);
        foodStorage.retrieve(cucumber);
        Assert.assertTrue(foodStorage.isEmpty());
    }
    @Test
    public void itemCount() {
        FoodStorage foodStorage=new FoodStorage();
        Tomato tomato=new Tomato();
        Cucumber cucumber=new Cucumber();
        EarOfCorn corn=new EarOfCorn();
        foodStorage.add(cucumber);
        foodStorage.add(corn);
        foodStorage.add(corn);
        foodStorage.retrieve(corn);
        Assert.assertEquals(2.0, foodStorage.itemCount(),0.0001);
    }
    @Test
    public void itemCount1() {
        FoodStorage foodStorage=new FoodStorage();
        Tomato tomato=new Tomato();
        Cucumber cucumber=new Cucumber();
        EarOfCorn corn=new EarOfCorn();
        foodStorage.add(cucumber);
        foodStorage.add(corn);
        foodStorage.add(corn);
        foodStorage.retrieve(corn);
        Assert.assertNotEquals(0.0, foodStorage.itemCount(),0.0001);
    }
}