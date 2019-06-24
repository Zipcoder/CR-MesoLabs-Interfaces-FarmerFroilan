package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Wool;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AlpacaTest {

    Alpaca alpaca = new Alpaca();
    Wool wool = new Wool();
    List<Edible> foodEaten = new ArrayList<Edible>();

    @Test
    public void collectWool() {
        //Given
        Wool expected = new Wool();

        //When
        Wool actual = alpaca.collectWool();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isHungry() {
        //Given
        Boolean expected = true;

        //When
        if (foodEaten.isEmpty() == true) {
            Boolean actual = alpaca.isHungry();
            //Then
            Assert.assertEquals(expected, actual);
        }

    }

    @Test
    public void reproduce() {
    }

    @Test
    public void eatEdible() {
    }

    @Test
    public void hasEaten() {
    }

    @Test
    public void getFoodEaten() {
    }

    @Test
    public void makeNoise() {
    }
}