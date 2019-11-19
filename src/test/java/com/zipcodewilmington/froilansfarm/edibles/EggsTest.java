package com.zipcodewilmington.froilansfarm.edibles;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EggsTest {

    @Test
    public void inheritanceTest(){
        Eggs egg = new Eggs();
        Assert.assertTrue(egg instanceof Edibles);
    }
}