package com.zipcodewilmington.froilansfarm.Animal;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InEdibleEggTest {

    @Test
    public void InEdibleEggTest(){
        InEdibleEgg inEdibleEggTest = new InEdibleEgg();

        boolean expected = false;
        boolean actual = inEdibleEggTest.IsEdible();

        Assert.assertEquals(expected, actual);
    }

}