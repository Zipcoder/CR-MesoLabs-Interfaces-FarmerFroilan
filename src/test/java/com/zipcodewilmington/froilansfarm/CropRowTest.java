package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.fieldsAndCrops.Crop;
import com.zipcodewilmington.froilansfarm.fieldsAndCrops.CropRow;
import com.zipcodewilmington.froilansfarm.fieldsAndCrops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.fieldsAndCrops.CropRow;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class CropRowTest {

    @Test
    public void constructorTest() {
        // When
        CropRow cropRows = new CropRow();
        Map actual = cropRows.getRows();

        // Then
        Assert.assertTrue(actual.isEmpty());
    }

    @Test
    public void setTestCorn() {
        // Given
        CropRow cropRow = new CropRow();
        int rowNum = 1;
        CornStalk cornStalk = new CornStalk();

         // When
        cropRow.setOneRow(rowNum, cornStalk);
        Crop actual = cropRow.getOneRow(1);

        // Then
        Assert.assertEquals(cornStalk, actual);
    }

    @Test
    public void setTestTomato() {
        // Given
        CropRow cropRow = new CropRow();
        int rowNum = 2;
        TomatoPlant tomatoPlant = new TomatoPlant();

        // When
        cropRow.setOneRow(rowNum, tomatoPlant);
        Crop actual = cropRow.getOneRow(2);

        // Then
        Assert.assertEquals(tomatoPlant, actual);
    }

}