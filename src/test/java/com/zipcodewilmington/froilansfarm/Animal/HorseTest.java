package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class HorseTest {

    @Test
    public void eatEdible() {
        //Given
        Horse horse = new Horse();
        Cucumber expected = new Cucumber();
        List<Edible> foodEaten = horse.foodEaten;
        foodEaten.add(expected);


        //When
        horse.eatEdible(expected);

        //Then
        Assert.assertTrue(horse.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible2() {
        //Given
        Horse horse = new Horse();
        Tomato expected = new Tomato();
        List<Edible> foodEaten = horse.foodEaten;
        foodEaten.add(expected);


        //When
        horse.eatEdible(expected);

        //Then
        Assert.assertTrue(horse.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible3() {
        //Given
        Horse horse = new Horse();
        StringBean expected = new StringBean();
        List<Edible> foodEaten = horse.foodEaten;
        foodEaten.add(expected);


        //When
        horse.eatEdible(expected);

        //Then
        Assert.assertTrue(horse.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible4() {
        //Given
        Horse horse = new Horse();
        EarOfCorn expected = new EarOfCorn();
        List<Edible> foodEaten = horse.foodEaten;
        foodEaten.add(expected);


        //When
        horse.eatEdible(expected);

        //Then
        Assert.assertTrue(horse.foodEaten.contains(expected));
    }

    @Test
    public void getFoodEaten() {
        //Given
        Horse horse = new Horse();
        List<Edible> foodEaten = horse.foodEaten;
        StringBean expected = new StringBean();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(horse.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten2() {
        //Given
        Horse horse = new Horse();
        List<Edible> foodEaten = horse.foodEaten;
        Tomato expected = new Tomato();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(horse.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten3() {
        //Given
        Horse horse = new Horse();
        List<Edible> foodEaten = horse.foodEaten;
        EarOfCorn expected = new EarOfCorn();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(horse.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten4() {
        //Given
        Horse horse = new Horse();
        List<Edible> foodEaten = horse.foodEaten;
        Cucumber expected = new Cucumber();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(horse.getFoodEaten().contains(expected));
    }

    @Test
    public void makeNoise() {
        //Given
        Horse horse = new Horse();
        String expected = "Neigh! Neigh!";

        //When
        String actual = horse.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }
}