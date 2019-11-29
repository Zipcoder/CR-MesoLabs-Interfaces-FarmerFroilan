package com.zipcodewilmington.froilansfarm.food;

import com.zipcodewilmington.froilansfarm.person.Farmer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornTest {

    Farmer froilan;

    @Test
    public void wasEaten() {

        froilan = new Farmer("Froilan");
        Corn corn = new Corn();

        froilan.eat(corn);

        Assert.assertTrue(corn.wasEaten());
    }

    @Test
    public void makeEaten() {

        froilan = new Farmer("Froilan");
        Corn corn = new Corn();

        froilan.eat(corn);
        int expected = 1;
        int actual = froilan.getFoodEaten();

        Assert.assertEquals(expected, actual);
    }
}