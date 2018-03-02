package com.zipcodewilmington.froilansfarm.VehiclesTest;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.Production.CornStalk;
import com.zipcodewilmington.froilansfarm.Production.CropRow;
import com.zipcodewilmington.froilansfarm.Production.Field;
import com.zipcodewilmington.froilansfarm.Production.TomatoPlant;
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
    private Farm testFarm;

    @Before
    public void setup() {
        testTractor = new Tractor();
        cropRow1 = new CropRow();
        cropRow2 = new CropRow();
        crop1 = new CornStalk();
        crop2 = new CornStalk();
        crop3 = new CornStalk();
        crop4 = new TomatoPlant();
        crop5 = new TomatoPlant();
        crop6 = new TomatoPlant();
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
        testFarm = new Farm();
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
    public void harvestTest1() {
        aFarmer.mount(testTractor);
        testTractor.harvest(aTestField);
        int expected = 0;
        int actual = aTestField.getCropField().get(0).getCropRow().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestTest2() {
        aFarmer.mount(testTractor);
        testTractor.harvest(aTestField);
        int expected = 6;
        int actual = testFarm.getEdibleStorage().size();
        Assert.assertEquals(expected, actual);
    }



}
