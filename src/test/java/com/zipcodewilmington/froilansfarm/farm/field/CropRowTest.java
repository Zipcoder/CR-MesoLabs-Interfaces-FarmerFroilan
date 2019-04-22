package com.zipcodewilmington.froilansfarm.farm.field;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.Crop;
import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {

    @Test
    public void addCropTest(){
        //Given
        CropRow test = new CropRow();
        Crop stalky = new CornStalk();

        //When
        test.addCrop(stalky);
        int expected = 1;
        int actual = test.getRowSize();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void removeCropTest(){
        //Given
        Crop stalky = new CornStalk();
        Crop stalker = new CornStalk();
        CropRow test = new CropRow(stalky, stalker);

        //When
        test.removeCrop(stalker);
        int expected = 1;
        int actual = test.getRowSize();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getCropTest(){
        //Given
        Crop stalky = new CornStalk();
        CropRow test = new CropRow(stalky);

        //When
        Crop expected = stalky;
        Crop actual = test.getCrop(stalky);

        //When
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getCropByIndexTest(){
        //Given
        Crop stalky = new CornStalk();
        CropRow test = new CropRow(stalky);

        //When
        Crop expected = stalky;
        Crop actual = test.getCrop(0);

        //When
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllCropsTest(){
        //Given
        Crop stalky = new CornStalk();
        Crop stalker = new CornStalk();
        CropRow test = new CropRow(stalky,stalker);

        //When
        Crop[] expected = {stalky,stalker};
        Crop[] actual = test.getAllCrops().toArray(new Crop[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
    }




}
