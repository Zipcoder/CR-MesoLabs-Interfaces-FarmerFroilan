package com.zipcodewilmington.froilansfarm.storagetest;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.storage.Stable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StableTest {

    Stable testStable;
    Horse testHorse;

    @Before
    public void init(){
        testStable = new Stable();
        testHorse = new Horse();
    }

    @Test
    public void addTest(){
        Boolean actual = testStable.add(testHorse);

        assertTrue(actual);
    }

    @Test
    public void addTest2(){
        testStable.add(testHorse);

        Boolean actual = testStable.add(testHorse);

        assertFalse(actual);
    }

    @Test
    public void removeTest(){
        Boolean actual = testStable.remove(testHorse);

        assertFalse(actual);
    }

    @Test
    public void removeTest2(){
        testStable.add(testHorse);
        Boolean actual = testStable.remove(testHorse);

        assertTrue(actual);
    }

    @Test
    public void sizeTest(){
        Integer expected = -1;

        Integer actual = testStable.size();

        assertEquals(expected, actual);
    }

}
