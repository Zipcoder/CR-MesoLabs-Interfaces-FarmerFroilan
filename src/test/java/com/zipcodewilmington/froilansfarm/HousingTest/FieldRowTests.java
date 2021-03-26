package com.zipcodewilmington.froilansfarm.HousingTest;

import com.zipcodewilmington.froilansfarm.Crops.BeanStalk;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import org.junit.Assert;
import org.junit.Test;

public class FieldRowTests {
    BeanStalk bean = new BeanStalk();
    CropRow row = new CropRow(5, bean);
    CropRow emptyRow = new CropRow();

    @Test
    public void fieldConstructor() {
        //Given
        Field field = new Field(1, row);
        int expected = 1;

        //When
        int actual = field.fieldSize();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fieldConstructorTwo() {
        //Given
        Field field = new Field();
        field.tillLand(1, emptyRow);
        emptyRow.plantCrops(bean);
        emptyRow.plantCrops(bean);
        emptyRow.plantCrops(bean);
        int expected = 3;

        //When
        int actual = field.fieldMap.get(1).cropsPerRow();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestRowOne() {
        //Given
        Field field = new Field(1, row);
        field.fieldMap.get(1).plantCrops(bean);

        //When
        int actual = field.harvestRow(1);

        //Then
        Assert.assertTrue(actual < 50 && actual > 5);
    }

    @Test
    public void harvestRowTwo() {
        //Given
        Field field = new Field();
        field.tillLand(1, emptyRow);
        field.fieldMap.get(1).plantCrops(bean);
        field.fieldMap.get(1).plantCrops(bean);
        field.fieldMap.get(1).plantCrops(bean);

        //When
        int actual = field.harvestRow(1);

        //Then
        Assert.assertTrue(actual > 2 && actual < 34);
    }

    @Test
    public void tillLand() {
        //Given
        Field field = new Field();
        field.tillLand(1, emptyRow);
        field.tillLand(2, emptyRow);

        //When
        int actual = field.fieldSize();

        //Then
        Assert.assertTrue(actual == 2);
    }
}
