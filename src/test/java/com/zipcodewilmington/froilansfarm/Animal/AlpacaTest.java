package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.*;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;
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
        Cucumber expected = new Cucumber();

        List<Edible> foodEaten = alpaca.foodEaten;
        foodEaten.add(expected);

        //When
        alpaca.eatEdible(expected);

        //Then
        Assert.assertTrue(foodEaten.contains(expected));
//      Assert.assertTrue(alpaca.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible2() {
        //Given
        Cow cow = new Cow();

        Tomato expected = new Tomato();
        List<Edible> foodEaten = cow.foodEaten;
        foodEaten.add(expected);

        //When
        cow.eatEdible((Edible) expected);

        //Then
        Assert.assertTrue(foodEaten.contains(expected));
    }

    @Test
    public void eatEdible3() {
        //Given
        Cow cow = new Cow();
        EarOfCorn expected = new EarOfCorn();
        List<Edible> foodEaten = cow.getFoodEaten();
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
        foodEaten.add( expected);


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
        Cucumber expected = new Cucumber();
        foodEaten.add(expected);

        //When
        alpaca.eatEdible(expected);

        //Then
        Assert.assertTrue(alpaca.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten2() {
        //Given
        Alpaca alpaca = new Alpaca();

        List<Edible> foodEaten = alpaca.foodEaten;
        Tomato expected = new Tomato();
        foodEaten.add(expected);

        //When
        alpaca.eatEdible(expected);

        //Then
        Assert.assertTrue(alpaca.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten3() {
        //Given
        Alpaca alpaca = new Alpaca();
        List<Edible> foodEaten = alpaca.getFoodEaten();
        EarOfCorn expected = new EarOfCorn();


        //When
        alpaca.eatEdible(expected);

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

    @Test
    public void instanceOf(){
        Alpaca alpaca = new Alpaca();
        Assert.assertTrue(alpaca instanceof Animal);
    }

    @Test
    public void instanceOf2(){
        Alpaca alpaca = new Alpaca();
        Assert.assertTrue(alpaca instanceof Produce);
    }

//    @Test
//    public void yield() {
//        //Given
//        Alpaca alpaca = new Alpaca();
//        WoolBasket woolBasket = new WoolBasket();
//        woolBasket.add((Edible) new Wool());
//        woolBasket.add((Edible) new Wool());
//        woolBasket.add((Edible) new Wool());
//        WoolBasket expected = woolBasket;
//
//        //When
//        WoolBasket actual = (WoolBasket) alpaca.yield();
//
//        //Then
//        Assert.assertEquals(expected, actual);
//    }
}