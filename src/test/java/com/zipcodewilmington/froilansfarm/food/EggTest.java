package com.zipcodewilmington.froilansfarm.food;

import com.zipcodewilmington.froilansfarm.person.Farmer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EggTest {

    Farmer froilan;

    @Test
    public void wasEaten() {

        froilan = new Farmer("Froilan");
        Egg egg = new Egg();

        froilan.eat(egg);

        Assert.assertTrue(egg.wasEaten());

    }

    @Test
    public void makeEaten() {

        froilan = new Farmer("Froilan");
        Egg egg = new Egg();

        froilan.eat(egg);
        int expected = 1;
        int actual = froilan.getFoodEaten();

        Assert.assertEquals(expected, actual);
    }

}