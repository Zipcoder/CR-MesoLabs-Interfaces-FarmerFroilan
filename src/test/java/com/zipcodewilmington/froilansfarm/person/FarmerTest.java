package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.edible.Egg;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    @Test
    public void testNullaryConstructor(){
        Farmer froilan = new Farmer("Froilan");
        String expected = "Froilan";

        String actual = froilan.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNullaryConstructor2(){
        Farmer froilan = new Farmer("Froilan");
        String expected = "Froilan";

        String actual = froilan.getName();

        Assert.assertNotEquals("Froilanda", actual);
    }

    @Test
    public void makeNoiseTest(){
    }

    @Test
    public void eatEggTest(){
        Farmer froilan = new Farmer("Froilan");
        Egg theEgg = new Egg();

//        froilan.eat(theEgg);
    }

}