package com.zipcodewilmington.froilansfarm.food;

import com.zipcodewilmington.froilansfarm.person.Farmer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoTest {

    Farmer froilan;

    @Test
    public void wasEaten() {

        froilan = new Farmer("Froilan");
        Tomato tomato = new Tomato();

        froilan.eat(tomato);

        Assert.assertTrue(tomato.wasEaten());

    }

    @Test
    public void makeEaten() {

       froilan = new Farmer("Froilan");
       Tomato tomato = new Tomato();

        froilan.eat(tomato);
        int expected = 1;
        int actual = froilan.getFoodEaten();

        Assert.assertEquals(expected, actual);
    }
}