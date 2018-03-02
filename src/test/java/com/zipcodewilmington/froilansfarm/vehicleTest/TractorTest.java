package com.zipcodewilmington.froilansfarm.vehicleTest;

import com.zipcodewilmington.froilansfarm.crop.*;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Silo;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {
    Tractor testTractor = new Tractor();

    @Test
    public void makeNoiseTest(){
        String expected =  "Vrrrrrr";
        String actual = testTractor.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHasRiderTest(){
        testTractor.ride();
        boolean actual = testTractor.getHasRider();
        Assert.assertTrue(actual);
    }

    @Test
    public void operateTest(){
        Field testField = new Field();
        for (int i =0; i < 5; i++){
            testField.getCropRowsInField()[0].getCropsInRow().add(new CornStalk());
        }
        for (int i =0; i < 5; i++){
            testField.getCropRowsInField()[0].getCropsInRow().get(i).setHasBeenFertilized(true);
        }
        testTractor.ride();
        testTractor.operate(testField);
        boolean actual = testField.getCropRowsInField()[0].getCropsInRow().get(4).getHasBeenHarvested();
        Assert.assertTrue(actual);
    }

    @Test
    public void tractorTest(){

        Farmer testFarmer = new Farmer();
        CropRow testCropRow1 = new CropRow();
        CropRow testCropRow2 = new CropRow();
        CropRow testCropRow3 = new CropRow();
        testFarmer.plant(testCropRow1, new CornStalk());
        testFarmer.plant(testCropRow2, new TomatoPlant());
        testFarmer.plant(testCropRow3, new PotatoPlant());
        Pilot pilotTest = new Pilot();
        CropDuster cropDusterTest = new CropDuster();
        Field testField = new Field();
        testField.getCropRowsInField()[0] = testCropRow1;
        testField.getCropRowsInField()[1] = testCropRow2;
        testField.getCropRowsInField()[2] = testCropRow3;
        pilotTest.mount(cropDusterTest);
        cropDusterTest.fly();
        cropDusterTest.operate(testField);
        Tractor tractorTest = new Tractor();
        testFarmer.mount(tractorTest);
        tractorTest.operate(testField);
        Silo siloTest = new Silo();
        tractorTest.depositHarvest(siloTest);
        int actual = siloTest.getEarCornStorage().size();
        int expected = 80;
        int actual2 = siloTest.getPotatoStorage().size();
        int expected2 = 80;
        int actual3 = siloTest.getPotatoStorage().size();
        int expetced3 = 80;
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expetced3, actual3);
    }

}
