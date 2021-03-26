package com.zipcodewilmington.froilansfarm.HousingTest;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import org.junit.Assert;
import org.junit.Test;

public class FieldTest {
    CropRow row = new CropRow();

    @Test
    public void fieldSize() {
        //Given
        Field field = new Field(5, row);
        int expected = 5;

        //When
        int actual = field.fieldSize();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addRow() {
        //Given
        Field field = new Field();
        int expected = 3;

        //When
        field.tillLand(1, row);
        field.tillLand(2, row);
        field.tillLand(3, row);
        int actual = field.fieldSize();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
