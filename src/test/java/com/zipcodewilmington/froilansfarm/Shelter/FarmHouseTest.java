package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animal.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.Froilan;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmHouseTest {

    @Test
    public void testIsEmpty1() {
        FarmHouse farmhouse1 = new FarmHouse();
        Farmer farmer1 = new Froilan();

        farmhouse1.add(farmer1);

        Boolean expected = false;
        Boolean actual = farmhouse1.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    public void TestIsEmpty2() {
        FarmHouse farmhouse1 = new FarmHouse();
        Farmer farmer1 = new Froilan();

        Boolean expected = true;
        Boolean actual = farmhouse1.isEmpty();

        assertEquals(expected, actual);
    }


    @Test
    public void testAdd1() {
        FarmHouse farmhouse1 = new FarmHouse();
        Farmer farmer1 = new Froilan();

        farmhouse1.add(farmer1);
        String expected = "farmer1";
        String actual = farmhouse1.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        FarmHouse farmhouse1 = new FarmHouse();
        Farmer farmer1 = new Froilan();
        Farmer farmer2 = new Froilan();

        farmhouse1.add(farmer1);
        farmhouse1.add(farmer2);

        Boolean actual = farmhouse1.isEmpty();

        assertFalse(actual);
    }

    @Test
    public void testRemove1() {
        FarmHouse farmhouse1 = new FarmHouse();
        Farmer farmer1 = new Froilan();
        Farmer farmer2 = new Froilan();

        farmhouse1.add(farmer1);
        farmhouse1.add(farmer2);

        farmhouse1.remove(farmer1);

        String expected = "farmer2";
        String actual = farmhouse1.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testRemove2() {
        FarmHouse farmhouse1 = new FarmHouse();
        Farmer farmer1 = new Froilan();
        Farmer farmer2 = new Froilan();

        farmhouse1.add(farmer1);
        farmhouse1.add(farmer2);

        farmhouse1.remove(farmer1);
        farmhouse1.remove(farmer2);

        Boolean expected = true;
        Boolean actual = farmhouse1.isEmpty();

        assertEquals(expected, actual);

    }

    @Test
    public void TestItemCount1() {
        FarmHouse farmhouse1 = new FarmHouse();
        Farmer farmer1 = new Froilan();
        Farmer farmer2 = new Froilan();

        farmhouse1.add(farmer1);
        farmhouse1.add(farmer2);

        Integer expected = 2;
        Integer actual = farmhouse1.itemCount();

        assertEquals(expected, actual);

    }

    @Test
    public void TestItemCount2() {
        FarmHouse farmhouse1 = new FarmHouse();
        Farmer farmer1 = new Froilan();
        Farmer farmer2 = new Froilan();

        farmhouse1.add(farmer1);
        farmhouse1.add(farmer2);

        farmhouse1.remove(farmer1);
        farmhouse1.remove(farmer2);

        Integer expected = null;
        Integer actual = farmhouse1.itemCount();

        assertEquals(expected, actual);

    }

}