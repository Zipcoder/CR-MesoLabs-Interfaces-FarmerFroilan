package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ChickenCoopTest {

    @Test
    public void testIsEmpty1() {
        ChickenCoop chickenCoop1 = new ChickenCoop();
        Chicken chicken1 = new Chicken();

        chickenCoop1.add(chicken1);

        Boolean expected = false;
        Boolean actual = chickenCoop1.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    public void TestIsEmpty2() {
        ChickenCoop chickenCoop1 = new ChickenCoop();
        Chicken chicken1 = new Chicken();

        Boolean expected = true;
        Boolean actual = chickenCoop1.isEmpty();

        assertEquals(expected, actual);
    }


    @Test
    public void testAdd1() {
        ChickenCoop chickenCoop1 = new ChickenCoop();
        Chicken chicken1 = new Chicken();

        chickenCoop1.add(chicken1);
        String expected = "chicken1";
        String actual = chickenCoop1.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        ChickenCoop chickenCoop1 = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();

        chickenCoop1.add(chicken1);
        chickenCoop1.add(chicken2);

        Boolean actual = chickenCoop1.isEmpty();

        assertFalse(actual);
    }

    @Test
    public void testRemove1() {
        ChickenCoop chickenCoop1 = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();

        chickenCoop1.add(chicken1);
        chickenCoop1.add(chicken2);

        chickenCoop1.remove(chicken1);

        String expected = "chicken2";
        String actual = chickenCoop1.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testRemove2() {
        ChickenCoop chickenCoop1 = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();

        chickenCoop1.add(chicken1);
        chickenCoop1.add(chicken2);

        chickenCoop1.remove(chicken1);
        chickenCoop1.remove(chicken2);

        Boolean expected = true;
        Boolean actual = chickenCoop1.isEmpty();

        assertEquals(expected, actual);

    }

    @Test
    public void TestItemCount1() {
        ChickenCoop chickenCoop1 = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();

        chickenCoop1.add(chicken1);
        chickenCoop1.add(chicken2);

        Integer expected = 2;
        Integer actual = chickenCoop1.itemCount();

        assertEquals(expected, actual);

    }

    @Test
    public void TestItemCount2() {
        ChickenCoop chickenCoop1 = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();

        chickenCoop1.add(chicken1);
        chickenCoop1.add(chicken2);

        chickenCoop1.remove(chicken1);
        chickenCoop1.remove(chicken2);

        Integer expected = null;
        Integer actual = chickenCoop1.itemCount();

        assertEquals(expected, actual);

    }
}