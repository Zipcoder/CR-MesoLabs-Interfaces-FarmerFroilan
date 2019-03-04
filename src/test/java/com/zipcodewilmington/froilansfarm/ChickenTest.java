package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {

    @Test
    public void yield() {
        Chicken chicken = new Chicken(false);

       boolean actual = chicken.isHasBeenFertilized();

        Assert.assertFalse(actual);

    }

    @Test
    public void eat() {
        Chicken chicken = new Chicken(true);





    }

    @Test
    public void makeNoise() {
        Chicken chicken = new Chicken(false);

        String expected = "cluck";
        String actual = chicken.makeNoise();

        Assert.assertEquals(expected, actual);
    }

}