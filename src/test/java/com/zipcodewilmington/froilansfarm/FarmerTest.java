package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible.Egg;
import com.zipcodewilmington.froilansfarm.Edible.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmerTest {

    Farmer farmer;
    Egg egg;
    Tomato tomato;

    @Before
    public void setup(){
        farmer = new Farmer("Farmer");
        egg = new Egg();
        tomato = new Tomato();
    }

    @Test
    public void makeNoiseTest(){
        String actual = farmer.makeNoise();
        String expected = "Howdy";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void eatTest(){
        int expected = farmer.getCalories() + 80;
        farmer.eat(egg);
        int actual = farmer.getCalories();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatVarArgsTest(){
        int expected = farmer.getCalories() + 120;
        farmer.eat(egg, tomato);
        int actual = farmer.getCalories();
        Assert.assertEquals(expected, actual);
    }


}
