package com.zipcodewilmington.froilansfarm.storagetest;

import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.Tomato;
import com.zipcodewilmington.froilansfarm.storage.Silo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class SiloTest {

    Silo testSilo;
    Edible testEdible;

    @Before
    public void init(){
        testSilo = new Silo();
        testEdible = new Tomato();
    }

    @Test
    public void addTest(){
        Boolean actual = testSilo.add(testEdible);

        assertTrue(actual);
    }

    @Test
    public void addTest2(){
        testSilo.add(testEdible);

        Boolean actual = testSilo.add(testEdible);

        assertFalse(actual);
    }

    @Test
    public void removeTest(){
        Boolean actual = testSilo.remove(testEdible);

        assertFalse(actual);
    }

    @Test
    public void removeTest2(){
        testSilo.add(testEdible);
        Boolean actual = testSilo.remove(testEdible);

        assertTrue(actual);
    }

    @Test
    public void sizeTest(){
        Integer expected = 0;

        Integer actual = testSilo.size();

        assertEquals(expected, actual);
    }

    @Test
    public void sizeTest2(){
        Integer expected = 1;
        testSilo.add(testEdible);

        Integer actual = testSilo.size();

        assertEquals(expected, actual);
    }

}
