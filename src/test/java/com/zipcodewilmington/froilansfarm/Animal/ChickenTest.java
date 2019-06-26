package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.*;
//import com.zipcodewilmington.froilansfarm.Tomato;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ChickenTest {

    @Test
    public void yieldEgg() {
        //Given
        Chicken chicken = new Chicken();

        //When
        Egg expected = new Egg();
        Egg actual = chicken.yieldEgg();

        //Then
        Assert.assertNotNull(actual);
    }

    @Test
    public void eatEdible() {
        //Given
        Chicken chicken = new Chicken();
        StringBean expected = new StringBean();
        List<Edible> foodEaten = chicken.foodEaten;
        foodEaten.add(expected);


        //When
        chicken.eatEdible(expected);

        //Then
        Assert.assertTrue(chicken.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible2() {
        //Given
        Chicken chicken = new Chicken();
        Tomato expected = new Tomato();
        List<Edible> foodEaten = chicken.foodEaten;
        foodEaten.add(expected);

        //When
        chicken.eatEdible(expected);

        //Then
        Assert.assertTrue(chicken.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible3() {
        //Given
        Chicken chicken = new Chicken();
        EarOfCorn expected = new EarOfCorn();
        List<Edible> foodEaten = chicken.foodEaten;
        foodEaten.add(expected);

        //When
        chicken.eatEdible(expected);

        //Then
        Assert.assertTrue(chicken.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible4() {
        //Given
        Chicken chicken = new Chicken();
        Cucumber expected = new Cucumber();
        List<Edible> foodEaten = chicken.foodEaten;
        foodEaten.add(expected);


        //When
        chicken.eatEdible(expected);

        //Then
        Assert.assertTrue(chicken.foodEaten.contains(expected));
    }

    @Test
    public void getFoodEaten() {
        //Given
        Chicken chicken = new Chicken();
        List<Edible> foodEaten = chicken.foodEaten;
        StringBean expected = new StringBean();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(chicken.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten2() {
        //Given
        Chicken chicken = new Chicken();
        List<Edible> foodEaten = chicken.foodEaten;
        Tomato expected = new Tomato();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(chicken.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten3() {
        //Given
        Chicken chicken = new Chicken();
        List<Edible> foodEaten = chicken.foodEaten;
        Cucumber expected = new Cucumber();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(chicken.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten4() {
        //Given
        Chicken chicken = new Chicken();
        List<Edible> foodEaten = chicken.foodEaten;
        EarOfCorn expected = new EarOfCorn();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(chicken.getFoodEaten().contains(expected));
    }

    @Test
    public void makeNoise() {
        //Given
        Chicken chicken = new Chicken();
        String expected = "Cluck! Cluck! Cluck-a-luck!";

        //When
        String actual = chicken.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hasEdible() {
        //Given
        Chicken chicken = new Chicken();
        Boolean expected = !chicken.getFertilized();

        //When
        Boolean actual = chicken.hasEdible();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void instanceOf(){
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void instanceOf2(){
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Produce);
    }
}