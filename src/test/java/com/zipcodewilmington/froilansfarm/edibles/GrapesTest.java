package com.zipcodewilmington.froilansfarm.edibles;


import org.junit.Assert;
import org.junit.Test;

public class GrapesTest {

    @Test
    public void inheritanceTest(){
        Grapes grapes= new Grapes();
        Assert.assertTrue(grapes instanceof Grapes);
    }

}