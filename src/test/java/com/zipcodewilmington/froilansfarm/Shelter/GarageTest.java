package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Test;

import static org.junit.Assert.*;

public class GarageTest {

    @Test
    public void testIsEmpty1() {
        Garage garage1 = new Garage();
        Tractor tractor1 = new Tractor();

        garage1.add(tractor1);

        Boolean expected = false;
        Boolean actual = garage1.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    public void TestIsEmpty2() {
        Garage garage1 = new Garage();
        Tractor tractor1 = new Tractor();

        Boolean expected = true;
        Boolean actual = garage1.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    public void testIsEmpty3() {
        Garage garage1 = new Garage();
        CropDuster cropDuster1 = new CropDuster();

        garage1.add(cropDuster1);

        Boolean expected = false;
        Boolean actual = garage1.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    public void TestIsEmpty4() {
        Garage garage1 = new Garage();
        CropDuster cropDuster1 = new CropDuster();

        Boolean expected = true;
        Boolean actual = garage1.isEmpty();

        assertEquals(expected, actual);
    }


    @Test
    public void testAdd1() {
        Garage garage1 = new Garage();
        Tractor tractor1 = new Tractor();

        garage1.add(tractor1);
        String expected = "tractor1";
        String actual = garage1.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        Garage garage1 = new Garage();
        Tractor tractor1 = new Tractor();
        Tractor tractor2 = new Tractor();

        garage1.add(tractor1);
        garage1.add(tractor2);

        Boolean actual = garage1.isEmpty();

        assertFalse(actual);
    }

    @Test
    public void testAdd3() {
        Garage garage1 = new Garage();
        CropDuster cropDuster1 = new CropDuster();

        garage1.add(cropDuster1);
        String expected = "cropDuster1";
        String actual = garage1.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testAdd4() {
        Garage garage1 = new Garage();
        CropDuster cropDuster1 = new CropDuster();
        CropDuster cropDuster2 = new CropDuster();

        garage1.add(cropDuster1);
        garage1.add(cropDuster2);

        Boolean actual = garage1.isEmpty();

        assertFalse(actual);
    }


    @Test
    public void testRemove1() {
        Garage garage1 = new Garage();
        Tractor tractor1 = new Tractor();
        Tractor tractor2 = new Tractor();

        garage1.add(tractor1);
        garage1.add(tractor2);

        garage1.remove(tractor1);

        String expected = "tractor2";
        String actual = garage1.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testRemove2() {
        Garage garage1 = new Garage();
        Tractor tractor1 = new Tractor();
        Tractor tractor2 = new Tractor();

        garage1.add(tractor1);
        garage1.add(tractor2);

        garage1.remove(tractor1);
        garage1.remove(tractor2);

        Boolean expected = true;
        Boolean actual = garage1.isEmpty();

        assertEquals(expected, actual);

    }

    @Test
    public void testRemove3() {
        Garage garage1 = new Garage();
        CropDuster cropDuster1 = new CropDuster();
        CropDuster cropDuster2 = new CropDuster();

        garage1.add(cropDuster1);
        garage1.add(cropDuster2);

        garage1.remove(cropDuster1);

        String expected = "cropDuster2";
        String actual = garage1.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testRemove4() {
        Garage garage1 = new Garage();
        CropDuster cropDuster1 = new CropDuster();
        CropDuster cropDuster2 = new CropDuster();

        garage1.add(cropDuster1);
        garage1.add(cropDuster2);

        garage1.remove(cropDuster1);
        garage1.remove(cropDuster2);

        Boolean expected = true;
        Boolean actual = garage1.isEmpty();

        assertEquals(expected, actual);

    }

    @Test
    public void TestItemCount1() {
        Garage garage1 = new Garage();
        Tractor tractor1 = new Tractor();
        Tractor tractor2 = new Tractor();

        garage1.add(tractor1);
        garage1.add(tractor2);

        Integer expected = 2;
        Integer actual = garage1.itemCount();

        assertEquals(expected, actual);

    }

    @Test
    public void TestItemCount2() {
        Garage garage1 = new Garage();
        Tractor tractor1 = new Tractor();
        Tractor tractor2 = new Tractor();

        garage1.add(tractor1);
        garage1.add(tractor2);

        garage1.remove(tractor1);
        garage1.remove(tractor2);

        Integer expected = null;
        Integer actual = garage1.itemCount();

        assertEquals(expected, actual);

    }

    @Test
    public void TestItemCount3() {
        Garage garage1 = new Garage();
        CropDuster cropDuster1 = new CropDuster();
        CropDuster cropDuster2 = new CropDuster();

        garage1.add(cropDuster1);
        garage1.add(cropDuster2);

        Integer expected = 2;
        Integer actual = garage1.itemCount();

        assertEquals(expected, actual);

    }

    @Test
    public void TestItemCount4() {
        Garage garage1 = new Garage();
        CropDuster cropDuster1 = new CropDuster();
        CropDuster cropDuster2 = new CropDuster();

        garage1.add(cropDuster1);
        garage1.add(cropDuster2);

        garage1.remove(cropDuster1);
        garage1.remove(cropDuster2);

        Integer expected = null;
        Integer actual = garage1.itemCount();

        assertEquals(expected, actual);

    }
}