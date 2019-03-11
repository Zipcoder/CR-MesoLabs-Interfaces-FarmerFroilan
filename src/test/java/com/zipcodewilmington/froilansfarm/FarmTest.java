package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;
import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class FarmTest {
    @Test
    public void testGetField(){
        //Given
        Farm farm = new Farm();

        //When
        int actualResult = farm.getField().size();

        //Then
        Assert.assertEquals(5,actualResult);
    }

    @Test
    public void testGetFieldCropRow1CornStalk(){
        //Given
        Farm farm = new Farm();

        //When
        Field actualField = farm.getField();

        CropRow actualCropRow = actualField.getList().get(0);

        //Then
        Assert.assertThat(actualCropRow.getList().get(0), instanceOf(CornStalk.class));
    }

    @Test
    public void testGetFieldCropRow2TomatoPlant(){
        //Given
        Farm farm = new Farm();

        //When
        Field actualField = farm.getField();

        CropRow actualCropRow = actualField.getList().get(1);

        //Then
        Assert.assertThat(actualCropRow.getList().get(0), instanceOf(TomatoPlant.class));
    }

    @Test
    public void testGetFieldCropRow3otherVeg(){
        //Given
        Farm farm = new Farm();

        //When
        Field actualField = farm.getField();

        CropRow actualCropRow = actualField.getList().get(2);

        //Then
        Assert.assertThat(actualCropRow.getList().get(0), instanceOf(OtherVegetation.class));
    }

    @Test
    public void testGetFieldCropRow4otherVeg(){
        //Given
        Farm farm = new Farm();

        //When
        Field actualField = farm.getField();

        CropRow actualCropRow = actualField.getList().get(2);

        //Then
        Assert.assertThat(actualCropRow.getList().get(0), instanceOf(OtherVegetation.class));
    }

    @Test
    public void testGetFieldCropRow5otherVeg(){
        //Given
        Farm farm = new Farm();

        //When
        Field actualField = farm.getField();
        CropRow actualCropRow = actualField.getList().get(2);

        //Then
        Assert.assertThat(actualCropRow.getList().get(0), instanceOf(OtherVegetation.class));
    }

    @Test
    public void testGetCountOfChickenCoop1(){
        //Given
        Farm farm = new Farm();

        //When
        int count = farm.getFirstChickenCoop().size();

        //Then
        Assert.assertEquals(4,count);
        Assert.assertThat(farm.getFirstChickenCoop().getList().get(0), instanceOf(Chicken.class));
    }

    @Test
    public void testGetCountOfChickenCoop2(){
        //Given
        Farm farm = new Farm();

        //When
        int count = farm.getSecondChickenCoop().getList().size();

        Assert.assertEquals(4,count);
        Assert.assertThat(farm.getFirstChickenCoop().getList().get(0), instanceOf(Chicken.class));
    }

    @Test
    public void testGetCountOfChickenCoop3(){
        //Given
        Farm farm = new Farm();

        //When
        int count = farm.getThirdChickenCoop().size();

        Assert.assertEquals(4,count);
        Assert.assertThat(farm.getFirstChickenCoop().getList().get(0), instanceOf(Chicken.class));
    }

    @Test
    public void testGetCountOfChickenCoop4(){
        //Given
        Farm farm = new Farm();

        //When
        int count = farm.getFourthChickenCoop().size();

        Assert.assertEquals(3,count);
        Assert.assertThat(farm.getFirstChickenCoop().getList().get(0), instanceOf(Chicken.class));
    }

    @Test
    public void testStable1(){
        //Given
        Farm farm = new Farm();
        //When
        int actual = farm.getStableOne().size();
        int expected = 3;

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertThat(farm.getStableOne().getList().get(0), instanceOf(Horse.class));
    }

    @Test
    public void testStable2(){
        //Given
        Farm farm = new Farm();
        //When
        int actual = farm.getStableTwo().size();
        int expected = 3;

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertThat(farm.getStableTwo().getList().get(0), instanceOf(Horse.class));
    }

    @Test
    public void testStable3(){
        //Given
        Farm farm = new Farm();
        //When
        int actual = farm.getStableThree().size();
        int expected = 4;

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertThat(farm.getStableThree().getList().get(0), instanceOf(Horse.class));
    }

    @Test
    public void testGetCropDuster(){
        //Given
        Farm farm = new Farm();
        //Then
        Assert.assertThat(farm.getCropDuster(), instanceOf(FarmVehicle.class));
    }

    @Test
    public void testGetTractor(){
        //Given
        Farm farm = new Farm();
        //Then
        Assert.assertThat(farm.getTractor(), instanceOf(FarmVehicle.class));
    }

    @Test
    public void testGetFarmHouse(){
        //Given
        Farm farm = new Farm();
        //Then
        Assert.assertThat(farm.getFarmHouse(), instanceOf(FarmHouse.class));
    }

}