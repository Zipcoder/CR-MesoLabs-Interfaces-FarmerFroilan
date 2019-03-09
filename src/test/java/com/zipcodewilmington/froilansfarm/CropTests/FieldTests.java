package com.zipcodewilmington.froilansfarm.CropTests;

import com.zipcodewilmington.froilansfarm.storage.CropRows;
import com.zipcodewilmington.froilansfarm.storage.Field;
import org.junit.Assert;
import org.junit.Test;

public class FieldTests {
    @Test
    public void nullaryConstructorTest(){
        // given
        Field field = new Field();
        Integer expected = 0;
        // when
        Integer actual = field.getNumberOfCropRows();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest(){
        // given
        Field field = new Field(5);
        Integer expected = 5;
        // when
        Integer actual = field.getNumberOfCropRows();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCropRowsTest(){
        // given
        Field field = new Field(4);
        Integer expected = 4;
        // when
        Integer actual = field.getNumberOfCropRows();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNumberOfCropRowsTest(){
        // given
        Field field = new Field();
        Integer expected = 7;
        // when
        field.setNumberOfCropRows(7);
        Integer actual = field.getNumberOfCropRows();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        // given
        Field field = new Field();
        CropRows cropRows = new CropRows();
        Integer expected = 1;
        // when
        field.add(cropRows);
        Integer actual = field.getNumberOfCropRows();
        // then
        Assert.assertEquals(expected, actual);
    }
}
