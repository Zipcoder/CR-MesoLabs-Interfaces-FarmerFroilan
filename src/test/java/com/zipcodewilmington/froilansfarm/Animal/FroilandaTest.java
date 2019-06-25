package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FroilandaTest {

    @Test
    public void eatEdible() {
        //Given
        Froilanda froilanda = new Froilanda();
        EarOfCorn expected = new EarOfCorn();
        List<Edible> foodEaten = froilanda.foodEaten;
        foodEaten.add(expected);

        //When
        froilanda.eatEdible(expected);

        //Then
        Assert.assertTrue(froilanda.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible2() {
        //Given
        Froilanda froilanda = new Froilanda();
        Cucumbers expected = new Cucumbers();
        List<Edible> foodEaten = froilanda.foodEaten;
        foodEaten.add((Edible) expected);

        //When
        froilanda.eatEdible((Edible) expected);

        //Then
        Assert.assertTrue(froilanda.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible3() {
        //Given
        Froilanda froilanda = new Froilanda();
        Tomatoes expected = new Tomatoes();
        List<Edible> foodEaten = froilanda.foodEaten;
        foodEaten.add((Edible) expected);

        //When
        froilanda.eatEdible((Edible) expected);

        //Then
        Assert.assertTrue(froilanda.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible4() {
        //Given
        Froilanda froilanda = new Froilanda();
        StringBeans expected = new StringBeans();
        List<Edible> foodEaten = froilanda.foodEaten;
        foodEaten.add((Edible) expected);

        //When
        froilanda.eatEdible((Edible) expected);

        //Then
        Assert.assertTrue(froilanda.foodEaten.contains(expected));
    }

    @Test
    public void getFoodEaten() {
        //Given
        Froilanda froilanda = new Froilanda();
        List<Edible> foodEaten = froilanda.foodEaten;
        EarOfCorn expected = new EarOfCorn();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(froilanda.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten2() {
        //Given
        Froilanda froilanda = new Froilanda();
        List<Edible> foodEaten = froilanda.foodEaten;
        StringBeans expected = new StringBeans();
        foodEaten.add((Edible) expected);

        //When

        //Then
        Assert.assertTrue(froilanda.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten3() {
        //Given
        Froilanda froilanda = new Froilanda();
        List<Edible> foodEaten = froilanda.foodEaten;
        Tomatoes expected = new Tomatoes();
        foodEaten.add((Edible) expected);

        //When

        //Then
        Assert.assertTrue(froilanda.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten4() {
        //Given
        Froilanda froilanda = new Froilanda();
        List<Edible> foodEaten = froilanda.foodEaten;
        Cucumbers expected = new Cucumbers();
        foodEaten.add((Edible) expected);

        //When

        //Then
        Assert.assertTrue(froilanda.getFoodEaten().contains(expected));
    }

    @Test
    public void makeNoise() {
        //Given
        Froilanda froilanda = new Froilanda();
        String expected = "Welcome to Froilan's farm. I'm Froilanda; the rootinest, tootinest pilot down in these parts!";

        //When
        String actual = froilanda.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }
}