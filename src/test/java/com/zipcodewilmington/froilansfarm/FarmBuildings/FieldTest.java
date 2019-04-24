package com.zipcodewilmington.froilansfarm.FarmBuildings;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FieldTest {
    Field testField;
    TomatoPlant testTomato = new TomatoPlant();
    CropRow testRow  = new CropRow(testTomato);
    CropRow testRow2 = new CropRow(testTomato);

    @Before
    public void setUp(){
        testField = new Field(testRow, testRow2);

    }
    @Test
    public void testCropRow(){
        TomatoPlant testTomato = new TomatoPlant();
        CropRow testRow = new CropRow(testTomato);
        testRow.getCropsInRow().add(testTomato);

        Crop actual = testRow.getCrops();
        Crop expected = testTomato;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testField(){
        Crop actual = testField.getCropRow(0).getCrops();
        Crop expected = testTomato;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getTestField(){
        int expected = 2;
        int actual = testField.getEntireCropRow().size();
        Assert.assertEquals(expected, actual);
    }
}
