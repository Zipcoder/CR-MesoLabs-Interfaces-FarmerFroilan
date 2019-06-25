package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void testIsEmpty1() {
        Field field = new Field();
        CropRow cropRow1 = new CropRow<>();

        field.add(cropRow1);

        Boolean expected = false;
        Boolean actual = field.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    public void TestIsEmpty2() {
        Field field = new Field();
        CropRow cropRow1 = new CropRow<>();

        Boolean expected = true;
        Boolean actual = field.isEmpty();

        assertEquals(expected, actual);
    }


    @Test
    public void testAdd1() {
        Field field = new Field();
        CropRow cropRow1 = new CropRow<>();

        field.add(cropRow1);
        String expected = "cropRow1";
        String actual = field.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        Field field = new Field();
        CropRow cropRow1 = new CropRow<>();
        CropRow cropRow2 = new CropRow<>();

        field.add(cropRow1);
        field.add(cropRow2);

        Boolean actual = field.isEmpty();

        assertFalse(actual);
    }

    @Test
    public void testRemove1() {
        Field field1 = new Field();
        CropRow cropRow1 = new CropRow<>();
        CropRow cropRow2 = new CropRow<>();

        field1.add(cropRow1);
        field1.add(cropRow2);

        field1.remove(cropRow1);

        String expected = "cropRow2";
        String actual = field1.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testRemove2() {
        Field field1 = new Field();
        CropRow cropRow1 = new CropRow<>();
        CropRow cropRow2 = new CropRow<>();

        field1.add(cropRow1);
        field1.add(cropRow2);

        field1.remove(cropRow1);
        field1.remove(cropRow2);

        Boolean expected = true;
        Boolean actual = field1.isEmpty();

        assertEquals(expected, actual);

    }

    @Test
    public void TestItemCount1() {
        Field field1 = new Field();
        CropRow cropRow1 = new CropRow<>();
        CropRow cropRow2 = new CropRow<>();

        field1.add(cropRow1);
        field1.add(cropRow2);

        Integer expected = 2;
        Integer actual = field1.itemCount();

        assertEquals(expected, actual);

    }

    @Test
    public void TestItemCount2() {
        Field field1 = new Field();
        CropRow cropRow1 = new CropRow<>();
        CropRow cropRow2 = new CropRow<>();

        field1.add(cropRow1);
        field1.add(cropRow2);

        field1.remove(cropRow1);
        field1.remove(cropRow2);

        Integer expected = null;
        Integer actual = field1.itemCount();

        assertEquals(expected, actual);
    }
}

