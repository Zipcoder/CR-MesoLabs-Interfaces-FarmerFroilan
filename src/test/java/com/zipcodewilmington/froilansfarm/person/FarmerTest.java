package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Egg;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.shelter.FoodInventory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    @Test
    public void testNullaryConstructor(){
        Farmer froilan = new Farmer("Froilan");
        String expected = "Froilan";

        String actual = froilan.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNullaryConstructor2(){
        Farmer froilan = new Farmer("Froilan");
        String expected = "Froilan";

        String actual = froilan.getName();

        Assert.assertNotEquals("Froilanda", actual);
    }

    @Test
    public void makeNoiseTest(){
        Farmer froilan = new Farmer("Froilan");
        String expected = "I'm farmer Froilan";

        String actual = froilan.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseTest2(){
        Farmer froilan = new Farmer("Froilan");
        String expected = "I'm farmer Froilanda";

        String actual = froilan.makeNoise();

        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        Farmer froilan = new Farmer("Froilan");
        FoodInventory food = new FoodInventory();
        Egg egg = new Egg();
        food.add(egg);
        food.add(egg);
        froilan.eat(egg, food);

        Integer expected = 1;
        Integer actual = food.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest2(){
        Farmer froilan = new Farmer("Froilan");
        FoodInventory food = new FoodInventory();
        Corn corn = new Corn();
        food.add(corn);
        food.add(corn);
        froilan.eat(corn, food);

        Integer expected = 1;
        Integer actual = food.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest3(){
        Farmer froilan = new Farmer("Froilan");
        FoodInventory food = new FoodInventory();
        Tomato tomato = new Tomato();
        food.add(tomato);
        food.add(tomato);
        froilan.eat(tomato, food);

        Integer expected = 1;
        Integer actual = food.size();

        Assert.assertEquals(expected, actual);
    }

}