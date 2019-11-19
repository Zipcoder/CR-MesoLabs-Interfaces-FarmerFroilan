package com.zipcodewilmington.froilansfarm.edibles;

import org.junit.Assert;
import org.junit.Test;

public class TomatosTest {

        @Test
        public void inheritanceTest(){
            Tomatos tomatos = new Tomatos();
            Assert.assertTrue(tomatos instanceof Edibles);
        }
}