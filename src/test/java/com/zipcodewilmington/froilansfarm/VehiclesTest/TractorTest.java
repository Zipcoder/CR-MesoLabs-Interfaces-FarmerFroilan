package com.zipcodewilmington.froilansfarm.VehiclesTest;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.Production.*;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TractorTest {

    private Tractor testTractor;
    private CropRow cropRow1;
    private CropRow cropRow2;
    private CornStalk crop1;
    private CornStalk crop2;
    private CornStalk crop3;
    private TomatoPlant crop4;
    private TomatoPlant crop5;
    private TomatoPlant crop6;
    private Farmer aFarmer;
    private Field aTestField;
    private EdibleStorage testEdibleStorage;

    @Before
    public void setup() {
        testTractor = new Tractor();
        cropRow1 = new CropRow();
        cropRow2 = new CropRow();
        crop1 = new CornStalk();
        crop1.beFertilized();
        crop2 = new CornStalk();
        crop2.beFertilized();
        crop3 = new CornStalk();
        crop3.beFertilized();
        crop4 = new TomatoPlant();
        crop4.beFertilized();
        crop5 = new TomatoPlant();
        crop5.beFertilized();
        crop6 = new TomatoPlant();
        crop6.beFertilized();
        aFarmer = new Farmer();
        aFarmer.plant(crop1, cropRow1);
        aFarmer.plant(crop2, cropRow1);
        aFarmer.plant(crop3, cropRow1);
        aFarmer.plant(crop4, cropRow2);
        aFarmer.plant(crop5, cropRow2);
        aFarmer.plant(crop6, cropRow2);
        aTestField = new Field();
        aTestField.addCropRow(cropRow1);
        aTestField.addCropRow(cropRow2);
        testEdibleStorage = new EdibleStorage();
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(testTractor instanceof FarmVehicle);
    }

    @Test
    public void toggleIsMountedTest1() {
        testTractor.toggleIsMounted();
        boolean expected = true;
        boolean actual = testTractor.getIsMounted();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toggleIsMountedTest2() {
        boolean expected = false;
        boolean actual = testTractor.getIsMounted();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void canOperateTest1() {
        boolean expected = false;
        boolean actual = testTractor.canOperate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void canOperateTest2() {
        aFarmer.mount(testTractor);
        boolean expected = true;
        boolean actual = testTractor.canOperate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestCropRowTest1() {
        aFarmer.mount(testTractor);
        testTractor.harvestCropRow(aTestField.getCropField().get(1), testEdibleStorage);
        int expected = 0;
        int actual = cropRow2.getCropRow().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestCropRowTest2() {
        aFarmer.mount(testTractor);
        testTractor.harvestCropRow(aTestField.getCropField().get(1), testEdibleStorage);
        int expected = 3;
        int actual = testEdibleStorage.getEdibleStorage().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestFieldTest1() {
        aFarmer.mount(testTractor);
        testTractor.harvestField(aTestField, testEdibleStorage);
        int expected = 0;
        int actual = aTestField.getCropField().get(0).getSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestFieldTest2() {
        aFarmer.mount(testTractor);
        testTractor.harvestField(aTestField, testEdibleStorage);
        int expected = 6;
        int actual = testEdibleStorage.getSize();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void harvestFieldTest3() {
        testTractor.harvestField(aTestField, testEdibleStorage);
        int expected = 0;
        int actual = testEdibleStorage.getSize();
        Assert.assertEquals(expected, actual);
    }



}
