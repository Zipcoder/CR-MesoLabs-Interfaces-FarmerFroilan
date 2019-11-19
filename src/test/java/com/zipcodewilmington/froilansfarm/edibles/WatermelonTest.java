package com.zipcodewilmington.froilansfarm.edibles;

import org.junit.Assert;
import org.junit.Test;

public class WatermelonTest {

    @Test
    public void inheritanceTest(){
        Watermelon watermelon= new Watermelon();
        Assert.assertTrue(watermelon instanceof Edibles);
    }
}