package com.zipcodewilmington.froilansfarm.Field;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FieldTest {

    @Before
    public void setUp(){

    }

    @Test
    public void GetCropRowsTest(){
        //Given
        Field fieldTest = new Field();
        CropRow tomatoPlantRow = new CropRow();

        tomatoPlantRow.addCrop(new TomatoPlant());
        tomatoPlantRow.addCrop(new TomatoPlant());
        tomatoPlantRow.addCrop(new TomatoPlant());

        // Five rows of Crops
        fieldTest.addCropRow(tomatoPlantRow);
        fieldTest.addCropRow(tomatoPlantRow);
        fieldTest.addCropRow(tomatoPlantRow);
        fieldTest.addCropRow(tomatoPlantRow);
        fieldTest.addCropRow(tomatoPlantRow);

        //When
        int expected = 5;
        int actual = fieldTest.getAllRows().size();


        //Expected
        Assert.assertEquals(expected, actual);

    }

//    @Test
//    public void GetSingleRowTest(){
//        //Given
//        Field fieldTest = new Field();
//
//        CropRow tomatoPlantRow = new CropRow();
//        tomatoPlantRow.addCrop(new TomatoPlant());
//        tomatoPlantRow.addCrop(new TomatoPlant());
//        tomatoPlantRow.addCrop(new TomatoPlant());
//
//        //First Row
//        fieldTest.addCropRow(tomatoPlantRow);
//
//        CropRow cornStalkRow = new CropRow();
//        cornStalkRow.addCrop(new CornStalk());
//        cornStalkRow.addCrop(new CornStalk());
//        cornStalkRow.addCrop(new CornStalk());
//        cornStalkRow.addCrop(new CornStalk());
//
//        //Second Row
//        fieldTest.addCropRow(cornStalkRow);
//
//        //When
//        int expected = 4;;
//
//        //Expected
//        Assert.assertEquals(expected, actual);

    }
