package com.zipcodewilmington.froilansfarm.ProductionTest;

import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.Production.CornStalk;
import com.zipcodewilmington.froilansfarm.Production.CropRow;
import com.zipcodewilmington.froilansfarm.Production.EdibleStorage;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropRowTest {

    CropRow testCropRow;
    CornStalk testCrop;
    CornStalk testCrop2;
    CornStalk testCrop3;
    Tractor testTractor;
    EdibleStorage testStorage;
    Farmer testFarmer;

    @Before
    public void setup() {
        testCropRow = new CropRow();
        testCrop = new CornStalk();
        testCrop2 = new CornStalk();
        testCrop3 = new CornStalk();
        testTractor = new Tractor();
        testStorage = new EdibleStorage();
        testFarmer = new Farmer();
    }

    @Test
    public void addCropRowTest() {
        testCropRow.addCrop(testCrop);
        int expected = 1;
        int actual = testCropRow.getSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeHarvestedCropsTest() {
        testCrop.beFertilized();
        testCrop2.beFertilized();
        testCrop3.beFertilized();
        testCropRow.addCrop(testCrop);
        testCropRow.addCrop(testCrop2);
        testCropRow.addCrop(testCrop3);
        testFarmer.mount(testTractor);
        testTractor.harvestCropRow(testCropRow, testStorage);
        int expected = 0;
        int actual = testCropRow.getSize();
        Assert.assertEquals(expected, actual);
    }
}
