package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/3/18
 */
public class FieldTest {
    Field field;

    @Before
    public void setup() {
        field = new Field();
    }

    @Test
    public void testAddCropRow() {
        int expected = field.getNumberOfCropRows() + 1;
        field.addCropRow(new CropRow());
        int actual = field.getNumberOfCropRows();

        Assert.assertEquals(expected, actual);
    }
}