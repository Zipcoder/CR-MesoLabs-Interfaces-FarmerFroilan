package com.zipcodewilmington.froilansfarm.vehicleTest;

import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Field;
import com.zipcodewilmington.froilansfarm.crop.PotatoPlant;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farm.Farm;
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
        Farm testFarm = new Farm();
        Farmer testFarmer = new Farmer();
        testFarmer.plant(testFarm.getFroilansField().getCropRowsInField()[0], new CornStalk());
        testFarmer.plant(testFarm.getFroilansField().getCropRowsInField()[1], new TomatoPlant());
        testFarmer.plant(testFarm.getFroilansField().getCropRowsInField()[2], new PotatoPlant());
        Pilot pilotTest = new Pilot();
        CropDuster cropDusterTest = new CropDuster();
        pilotTest.mount(cropDusterTest);
        cropDusterTest.fly();
        cropDusterTest.operate(testFarm.getFroilansField());
        Tractor tractorTest = new Tractor();
        testFarmer.mount(tractorTest);
        tractorTest.operate(testFarm.getFroilansField());
        tractorTest.depositHarvest(testFarm.getFoodSilo());
        int actual = testFarm.getFoodSilo().getEarCornStorage().size();
        int expected = 25;
        int actual2 = testFarm.getFoodSilo().getPotatoStorage().size();
        int expected2 = 25;
        int actual3 = testFarm.getFoodSilo().getPotatoStorage().size();
        int expetced3 = 25;
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expetced3, actual3);
    }

}
