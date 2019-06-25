package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AlpacaTest {


    @Test
    public void collectWool() {
        //Given
        Alpaca alpaca = new Alpaca();

        //When
        Wool expected = new Wool();
        Wool actual = alpaca.collectWool();

        //Then

        Assert.assertNotNull(actual);
//       Assert.assertEquals(thisClass.getSimpleName(),"Wool");
    }

    @Test
    public void eatEdible() {
        //Given
        Alpaca alpaca = new Alpaca();
        Cucumbers expected = new Cucumbers();
        List<Edible> foodEaten = alpaca.foodEaten;
        foodEaten.add(expected);


        //When
        alpaca.eatEdible(expected);

        //Then
        Assert.assertTrue(alpaca.foodEaten.contains(expected));
//      Assert.assertTrue(alpaca.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible2() {
        //Given
        Cow cow = new Cow();
        Cucumbers expected = new Cucumbers();
        List<Edible> foodEaten = cow.foodEaten;
        foodEaten.add(expected);

        //When
        cow.eatEdible(expected);

        //Then
        Assert.assertTrue(cow.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible3() {
        //Given
        Cow cow = new Cow();
        EarOfCorn expected = new EarOfCorn();
        List<Edible> foodEaten = cow.foodEaten;
        foodEaten.add(expected);


        //When
        cow.eatEdible(expected);

        //Then
        Assert.assertTrue(cow.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible4() {
        //Given
        Cow cow = new Cow();
        StringBeans expected = new StringBeans();
        List<Edible> foodEaten = cow.foodEaten;
        foodEaten.add(expected);


        //When
        cow.eatEdible(expected);

        //Then
        Assert.assertTrue(cow.foodEaten.contains(expected));
    }

    @Test
    public void getFoodEaten() {
        //Given
        Alpaca alpaca = new Alpaca();
        List<Edible> foodEaten = alpaca.foodEaten;
        Cucumbers expected = new Cucumbers();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(alpaca.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten2() {
        //Given
        Alpaca alpaca = new Alpaca();
        List<Edible> foodEaten = alpaca.foodEaten;
        Tomatoes expected = new Tomatoes();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(alpaca.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten3() {
        //Given
        Alpaca alpaca = new Alpaca();
        List<Edible> foodEaten = alpaca.foodEaten;
        EarOfCorn expected = new EarOfCorn();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(alpaca.getFoodEaten().contains(expected));
    }

    @Test
    public void makeNoise() {
        //Given
        Alpaca alpaca = new Alpaca();

        //When
        String expected = "Mehh! Mehh!";
        String actual = alpaca.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }
}