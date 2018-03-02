package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FieldTest {

    Field field;
    CropRow cropRow;
    CropRow cropRow2;

    @Before
    public void setup() {
        field = new Field();
        cropRow = new CropRow();
        cropRow2 = new CropRow();
    }

    @Test
    public void getRowsOfCropsTest() {
        Crop tomatoPlant = new TomatoPlant();
        Crop tomatoPlant2 = new TomatoPlant();
        Crop tomatoPlant3 = new TomatoPlant();
        Crop tomatoPlant4 = new TomatoPlant();

        cropRow.addCrops(tomatoPlant);
        cropRow.addCrops(tomatoPlant2);

        cropRow2.addCrops(tomatoPlant3);
        cropRow2.addCrops(tomatoPlant4);

        field.addRowsOfCrops(cropRow);
        field.addRowsOfCrops(cropRow2);

        List<CropRow> expected = Arrays.asList(cropRow, cropRow2);
        List<CropRow> actual = field.getRowsOfCrops();

        Assert.assertEquals(expected, actual);
    }

}