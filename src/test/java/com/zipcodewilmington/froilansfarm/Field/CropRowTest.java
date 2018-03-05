package com.zipcodewilmington.froilansfarm.Field;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CropRowTest {

    @Test
    public void getRowOfCrops(){
        //Given
        CropRow row = new CropRow();
        TomatoPlant tomatoPlantTest = new TomatoPlant();

        row.addCrop(tomatoPlantTest);
        row.addCrop(tomatoPlantTest);
        row.addCrop(tomatoPlantTest);

        //When
        int expected = 3;
        int actual = row.getCropRow().size();


        //Then
        Assert.assertEquals(expected, actual);

    }

}