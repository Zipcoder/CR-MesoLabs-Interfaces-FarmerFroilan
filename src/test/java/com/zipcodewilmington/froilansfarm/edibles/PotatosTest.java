package com.zipcodewilmington.froilansfarm.edibles;

import org.junit.Assert;
import org.junit.Test;

public class PotatosTest {

    @Test
    public void inheritanceTest(){
        Potatos potatos = new Potatos();
        Assert.assertTrue(potatos instanceof Edibles);
    }
}