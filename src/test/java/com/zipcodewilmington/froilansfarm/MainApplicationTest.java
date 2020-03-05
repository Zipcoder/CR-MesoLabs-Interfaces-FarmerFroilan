package com.zipcodewilmington.froilansfarm;

import com.sun.javafx.stage.StageHelper;
import com.zipcodewilmington.froilansfarm.crop.*;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.food.Tomato;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplicationTest {
//    @Test
//    public void testFarmConstructor(){
//        //farm state
//        Farm theFarm = new Farm(3,4,1);
//        Field theField = new Field();
//        theField.setCropRow(1, new CornStalk());
//        theField.setCropRow(2, new TomatoPlant());
//        theField.setCropRow(3, new OnionRoot());
//        theField.setCropRow(4, new PotatoRoot());
//        theField.setCropRow(5, new CarrotRoot());
//
//        //number of Stables
//        int expected = 3;
//        int actual = theFarm.getNumOfStables();
//        Assert.assertEquals(expected,actual);
//
//        //number of coops
//        int expected2 = 4;
//        int actual2 = theFarm.getNumOfCoops();
//        Assert.assertEquals(expected2,actual2);
//
//        //number of fields
//        int expected3 = 4;
//        int actual3 = theFarm.getNumOfFields();
//        Assert.assertEquals(expected3,actual3);
//    }
//
//    @Test
//    public void testSetCropRow(){
//        //farm state
//        Farm theFarm = new Farm(3,4,1);
//        Field theField = new Field();
//        theField.setCropRow(1, new CornStalk());
//        theField.setCropRow(2, new TomatoPlant());
//        theField.setCropRow(3, new OnionRoot());
//        theField.setCropRow(4, new PotatoRoot());
//        theField.setCropRow(5, new CarrotRoot());
//
//        // cornStalk
//        Crop expected = new CornStalk();
//        Crop actual = theField.getCropRow(1).getCrop();
//        Assert.assertEquals(expected,actual);
//
//        //TomatoPlant
//        Crop expected2 = new TomatoPlant();
//        Crop actual2 = theField.getCropRow(2).getCrop();
//        Assert.assertEquals(expected2,actual2);
//
//        //OnionRoot
//        Crop expected3 = new OnionRoot();
//        Crop actual3 = theField.getCropRow(3).getCrop();
//        Assert.assertEquals(expected3,actual3);
//
//        //PotatoRoot
//        Crop expected4 = new PotatoRoot();
//        Crop actual4 = theField.getCropRow(4).getCrop();
//        Assert.assertEquals(expected4,actual4);
//
//        //CarrotRoot
//        Crop expected5 = new CarrotRoot();
//        Crop actual5 = theField.getCropRow(5).getCrop();
//        Assert.assertEquals(expected5,actual5);
//    }
//
//    @Test
//    public void testChickenCoops(){
//        //farm state
//        Farm theFarm = new Farm(3,4,1);
//        Field theField = new Field();
//        theField.setCropRow(1, new CornStalk());
//        theField.setCropRow(2, new TomatoPlant());
//        theField.setCropRow(3, new OnionRoot());
//        theField.setCropRow(4, new PotatoRoot());
//        theField.setCropRow(5, new CarrotRoot());
//        ChickenCoop coop1 = new ChickenCoop();
//        coop1.addChickens(4);
//        ChickenCoop coop2 = new ChickenCoop();
//        coop2.addChickens(4);
//        ChickenCoop coop3 = new ChickenCoop();
//        coop3.addChickens(4);
//        ChickenCoop coop4 = new ChickenCoop();
//        coop4.addChickens(3);
//
//        //coop1
//        int expected = 4;
//        int actual = coop1.getNumOfChickens();
//        Assert.assertEquals(expected,actual);
//
//        //coop2
//        int expected2 = 4;
//        int actual2 = coop2.getNumOfChickens();
//        Assert.assertEquals(expected,actual);
//
//        //coop3
//        int expected3 = 4;
//        int actual3 = coop3.getNumOfChickens();
//        Assert.assertEquals(expected3,actual3);
//
//        //coop4
//        int expected4 = 3;
//        int actual4 = 3;
//        Assert.assertEquals(expected4,actual4);
    }


}
