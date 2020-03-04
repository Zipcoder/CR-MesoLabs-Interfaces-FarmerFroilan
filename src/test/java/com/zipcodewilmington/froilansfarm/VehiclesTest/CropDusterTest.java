package com.zipcodewilmington.froilansfarm.VehiclesTest;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.Production.CornStalk;
import com.zipcodewilmington.froilansfarm.Production.CropRow;
import com.zipcodewilmington.froilansfarm.Production.Field;
import com.zipcodewilmington.froilansfarm.Production.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropDusterTest {

    private CropDuster testDuster;
    private CropRow testCropRow1;
    private CropRow testCropRow2;
    private CornStalk crop1;
    private CornStalk crop2;
    private CornStalk crop3;
    private TomatoPlant crop4;
    private TomatoPlant crop5;
    private TomatoPlant crop6;
    private Farmer aFarmer;
    private Field aTestField;

    @Before
    public void setup() {
        testDuster = new CropDuster();
        testCropRow1 = new CropRow();
        testCropRow2 = new CropRow();
        crop1 = new CornStalk();
        crop2 = new CornStalk();
        crop3 = new CornStalk();
        crop4 = new TomatoPlant();
        crop5 = new TomatoPlant();
        crop6 = new TomatoPlant();
        aFarmer = new Farmer();
        aFarmer.plant(crop1, testCropRow1);
        aFarmer.plant(crop2, testCropRow1);
        aFarmer.plant(crop3, testCropRow1);
        aFarmer.plant(crop4, testCropRow2);
        aFarmer.plant(crop5, testCropRow2);
        aFarmer.plant(crop6, testCropRow2);
        aTestField = new Field();
        aTestField.addCropRow(testCropRow1);
        aTestField.addCropRow(testCropRow2);
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(testDuster instanceof FarmVehicle);
    }

    @Test
    public void toggleIsMountedTest1() {
        testDuster.toggleIsMounted();
        boolean expected = true;
        boolean actual = testDuster.getIsMounted();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toggleIsMountedTest2() {
        boolean expected = false;
        boolean actual = testDuster.getIsMounted();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void canOperateTest1() {
        boolean expected = false;
        boolean actual = testDuster.canOperate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void canOperateTest2() {
        aFarmer.mount(testDuster);
        boolean expected = true;
        boolean actual = testDuster.canOperate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fertilizeCropRowTest1() {
        aFarmer.mount(testDuster);
        testDuster.fertilizeCropRow(testCropRow1);
        boolean expected = true;
        boolean actual = crop1.getHasBeenFertilized();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fertilizeCropRowTest2() {
        aFarmer.mount(testDuster);
        testDuster.fertilizeCropRow(testCropRow2);
        Assert.assertTrue(crop6.getHasBeenFertilized());
    }

    @Test
    public void fertilizeFieldTest1() {
        aFarmer.mount(testDuster);
        testDuster.fertilizeField(aTestField);
        boolean expected = true;
        boolean actual = crop2.getHasBeenFertilized();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fertilizeFieldTest2() {
        aFarmer.mount(testDuster);
        testDuster.fertilizeField(aTestField);
        Assert.assertTrue(crop6.getHasBeenFertilized());
    }


}
