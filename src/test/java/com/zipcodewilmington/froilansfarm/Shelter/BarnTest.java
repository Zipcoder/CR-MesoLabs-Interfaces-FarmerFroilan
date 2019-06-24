package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animal.Cow;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarnTest {

    @Test
    public void testIsEmpty1() {
        Barn stable1 = new Barn();
        Cow cow1 = new Cow();

        stable1.add(cow1);

        Boolean expected = false;
        Boolean actual = stable1.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    public void TestIsEmpty2() {
        Barn stable1 = new Barn();
        Cow cow1 = new Cow();

        Boolean expected = true;
        Boolean actual = stable1.isEmpty();

        assertEquals(expected, actual);
    }


    @Test
    public void testAdd1() {
        Barn stable1 = new Barn();
        Cow cow1 = new Cow();

        stable1.add(cow1);
        String expected = "cow1";
        String actual = stable1.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        Barn stable1 = new Barn();
        Cow cow1 = new Cow();
        Cow cow2 = new Cow();

        stable1.add(cow1);
        stable1.add(cow2);

        Boolean actual = stable1.isEmpty();

        assertFalse(actual);
    }

    @Test
    public void testRemove1() {
        Barn stable1 = new Barn();
        Cow cow1 = new Cow();
        Cow cow2 = new Cow();

        stable1.add(cow1);
        stable1.add(cow2);

        stable1.remove(cow1);

        String expected = "cow2";
        String actual = stable1.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testRemove2() {
        Barn stable1 = new Barn();
        Cow cow1 = new Cow();
        Cow cow2 = new Cow();

        stable1.add(cow1);
        stable1.add(cow2);

        stable1.remove(cow1);
        stable1.remove(cow2);

        Boolean expected = true;
        Boolean actual = stable1.isEmpty();

        assertEquals(expected, actual);

    }

    @Test
    public void TestItemCount1() {
        Barn stable1 = new Barn();
        Cow cow1 = new Cow();
        Cow cow2 = new Cow();

        stable1.add(cow1);
        stable1.add(cow2);

        Integer expected = 2;
        Integer actual = stable1.itemCount();

        assertEquals(expected, actual);

    }

    @Test
    public void TestItemCount2() {
        Barn stable1 = new Barn();
        Cow cow1 = new Cow();
        Cow cow2 = new Cow();

        stable1.add(cow1);
        stable1.add(cow2);

        stable1.remove(cow1);
        stable1.remove(cow2);

        Integer expected = null;
        Integer actual = stable1.itemCount();

        assertEquals(expected, actual);

    }
}