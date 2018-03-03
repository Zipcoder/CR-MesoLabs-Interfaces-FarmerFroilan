package com.zipcodewilmington.froilansfarm.FarmBuildings;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FieldTest {
    Field testField;

    @Before
    public void setUp(){
        testField = new Field();
    }
    @Test
    public void testField(){
        CropRow testRow = new CropRow();
        Tomato testTomato = new Tomato();
        testRow.getCropRow().add(testTomato);
        testField.getCropRow()[0] = testRow;
        String actual = testField.getCropRow()[0].getCropRow().toString();
        String expected = "[com.zipcodewilmington.froilansfarm.Edibles.Tomato@51521cc1]";
        Assert.assertEquals(expected, actual);

    }
}
