package com.zipcodewilmington.froilansfarm.animalstest;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    @Test
    public void eatFoodTest(){
        //

    }

    @Test
    public void makeNoiseTest(){

    }

    @Test
    public void chickenConstructorTest(){

    }

    @Test
    public void setIdTest(){
        Chicken chick1 = new Chicken();
        Integer expected = 3;
        chick1.setId(expected);
        Integer actual = chick1.getId();
        Assert.assertEquals(expected, actual);

    }
}
