package com.zipcodewilmington.froilansfarm.ProductionTest;

import com.zipcodewilmington.froilansfarm.Production.CropRow;
import com.zipcodewilmington.froilansfarm.Production.Field;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FieldTest {

    Field testField;
    CropRow testCropRow;

    @Before
    public void setup() {
        testField = new Field();
        testCropRow = new CropRow();
    }

    @Test
    public void addCropRowTest() {
        testField.addCropRow(testCropRow);
        int expected = 1;
        int actual = testField.getCropField().size();
        Assert.assertEquals(expected, actual);
    }


}
