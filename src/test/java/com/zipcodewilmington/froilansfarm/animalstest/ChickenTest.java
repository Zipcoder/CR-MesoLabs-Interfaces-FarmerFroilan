package com.zipcodewilmington.froilansfarm.animalstest;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

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
        Integer givenId = 2;
        Chicken chick1 = new Chicken(givenId);
        Integer retrievedId = chick1.getId();
        Assert.assertEquals(givenId, retrievedId);
        

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
