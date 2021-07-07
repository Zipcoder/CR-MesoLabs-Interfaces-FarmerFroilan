package com.zipcodewilmington.froilansfarm.FieldRelated;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void add() {
        Field test = new Field();
        test.add(new CropRow());
        Integer actual = test.getCropRows().size();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void remove() {
        Field test = new Field();
        test.add(new CropRow());
        test.remove(new CropRow());
        Integer actual = test.getCropRows().size();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getCropRows() {
        Field test = new Field();

        String actual = test.getCropRows().getClass().getSimpleName();
        String expected = "ArrayList";
        Assert.assertEquals(expected, actual);

    }
}