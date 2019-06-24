package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StableTest {

    @Test
    public void testIsEmpty1() {
        Stable stable1 = new Stable();
        Horse horse1 = new Horse();

        stable1.add(horse1);

        Boolean expected = false;
        Boolean actual = stable1.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    public void TestIsEmpty2() {
        Stable stable1 = new Stable();
        Horse horse1 = new Horse();

        Boolean expected = true;
        Boolean actual = stable1.isEmpty();

        assertEquals(expected, actual);
    }


    @Test
    public void testAdd1() {
        Stable stable1 = new Stable();
        Horse horse1 = new Horse();

        stable1.add(horse1);
        String expected = "horse1";
        String actual = stable1.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        Stable stable1 = new Stable();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();

        stable1.add(horse1);
        stable1.add(horse2);

        Boolean actual = stable1.isEmpty();

        assertFalse(actual);
    }

    @Test
    public void testRemove1() {
        Stable stable1 = new Stable();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();

        stable1.add(horse1);
        stable1.add(horse2);

        stable1.remove(horse1);

        String expected = "horse2";
        String actual = stable1.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testRemove2() {
        Stable stable1 = new Stable();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();

        stable1.add(horse1);
        stable1.add(horse2);

        stable1.remove(horse1);
        stable1.remove(horse2);

        Boolean expected = true;
        Boolean actual = stable1.isEmpty();

        assertEquals(expected, actual);

    }

    @Test
    public void TestItemCount1() {
            Stable stable1 = new Stable();
            Horse horse1 = new Horse();
            Horse horse2 = new Horse();

            stable1.add(horse1);
            stable1.add(horse2);

            Integer expected = 2;
            Integer actual = stable1.itemCount();

            assertEquals(expected, actual);

        }

    @Test
    public void TestItemCount2() {
        Stable stable1 = new Stable();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();

        stable1.add(horse1);
        stable1.add(horse2);

        stable1.remove(horse1);
        stable1.remove(horse2);

        Integer expected = null;
        Integer actual = stable1.itemCount();

        assertEquals(expected, actual);

    }

}