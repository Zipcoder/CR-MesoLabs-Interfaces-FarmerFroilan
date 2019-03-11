package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TractorTest {

//    @Test
//    public void testharvest() {
//       //Given
//        Tractor tractor = new Tractor();
//        CropRow cropRow= new CropRow();
//        TomatoPlant tomato = new TomatoPlant();
//        cropRow.add(tomato);
//       Field field = new Field();
//
//        int expectedSize =0;
//
//        //When
//        tractor.harvest(cropRow);
//        int actualSize = field.fieldCropRow.size();
//
//        //Then
//        Assert.assertEquals(expectedSize,actualSize);
//    }

    @Test
    public void testHarvest(){
        //Given
        Tractor tractor = new Tractor();
        CropRow cropRow = new CropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        CornStalk cornStalk = new CornStalk();
        TomatoPlant tp = new TomatoPlant();
        cropRow.add(tomatoPlant);
        cropRow.add(cornStalk);
        cropRow.add(tp);


        //When
        tractor.harvest(cropRow);

        //Then
        Assert.assertTrue(cropRow.size() == 0);
    }

    @Test
    public void testOperate(){
        //Given
        Tractor tractor = new Tractor();
        Farm testFarm = new Farm();

        //When
        tractor.operate(testFarm);
        CropRow actualCropRow = testFarm.getField().getList().get(0);

        //Then

        Assert.assertTrue(actualCropRow.size() == 0);
    }
}