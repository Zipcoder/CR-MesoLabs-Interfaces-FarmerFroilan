package com.zipcodewilmington.froilansfarm.vehiclestest;

import com.zipcodewilmington.froilansfarm.producers.produce.Corn;
import com.zipcodewilmington.froilansfarm.storage.CropRows;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;


public class CropDusterTest {

    @Test
    public void testMakeNoise(){
        // Given
        String expected = "Engine Roaring";
        CropDuster cropDuster = new CropDuster();

        // When
        String actual = cropDuster.makeNoise();

        // Then
        Assert.assertEquals(expected, actual);


    }

    // Failing without sytnax issues - once Need getCrop from cropRow and Corn methods created - then will update testCase
    @Test
    public void testFertilizeRow(){
        // Given

        //CropDuster cropDuster = new CropDuster();
        //CropRows cropRowsCorn = new CropRows(1, 0, 0);
        Boolean expected = false;

        // When
       //  cropDuster.fertilize(cropRowsCorn);
        //Corn corn =  cropRowsCorn.getCrop;
        //  Corn corn = new Corn();
       // expected = corn.hasBeenFertilized();
        // Then
        Assert.assertTrue(expected);

    }
}
