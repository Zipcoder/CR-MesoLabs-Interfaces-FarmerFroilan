package com.zipcodewilmington.froilansfarm.FarmBuildings;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        String actual = testField.getCropRow().getClass().getSimpleName();
        String expected = "CropRow[]";
        Assert.assertEquals(expected, actual);

    }
}
