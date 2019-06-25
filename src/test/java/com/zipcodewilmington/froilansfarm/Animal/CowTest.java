package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CowTest {

    @Test
    public void isMilkable() {
        //Given
        Cow cow = new Cow();
        List<Edible> foodEaten = new ArrayList<>();
        Boolean expected = !foodEaten.isEmpty();

        //When
        Boolean actual = cow.isMilkable();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void yieldMilk() {
        //Given
        Cow cow = new Cow();

        //When
        Milk expected = new Milk();
        Milk actual = cow.yieldMilk();

        //Then

        Assert.assertNotNull(actual);
}

    @Test
    public void makeNoise() {
        //Given
        Cow cow = new Cow();
        String expected = "Mooo!! Mooooo!!";

        //When
        String actual = cow.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatEdible() {
        //Given
        Cow cow = new Cow();
        Tomato expected = new Tomato();
        List<Edible> foodEaten = cow.foodEaten;
        foodEaten.add(expected);


        //When
        cow.eatEdible(expected);

        //Then
        Assert.assertTrue(cow.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible2() {
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
    public void eatEdible3() {
        //Given
        Cow cow = new Cow();
        Cucumber expected = new Cucumber();
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
        StringBean expected = new StringBean();
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
        Cow cow = new Cow();
        List<Edible> foodEaten = cow.foodEaten;
        Tomato expected = new Tomato();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(cow.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten2() {
        //Given
        Cow cow = new Cow();
        List<Edible> foodEaten = cow.foodEaten;
        Cucumber expected = new Cucumber();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(cow.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten3() {
        //Given
        Cow cow = new Cow();
        List<Edible> foodEaten = cow.foodEaten;
        EarOfCorn expected = new EarOfCorn();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(cow.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten4() {
        //Given
        Cow cow = new Cow();
        List<Edible> foodEaten = cow.foodEaten;
        StringBean expected = new StringBean();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(cow.getFoodEaten().contains(expected));
    }

}