package com.zipcodewilmington.froilansfarm.vehiclestest;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.farmland.CropRow;
import com.zipcodewilmington.froilansfarm.food.CornStalk;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.FarmVehicle;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import com.zipcodewilmington.froilansfarm.vehicles.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void instanceOfVehicleTest(){
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Vehicle);
        Assert.assertTrue(tractor instanceof FarmVehicle);
    }
    @Test
    public void makeNoiseTest(){
        Tractor tractor = new Tractor();
        String expected = "KlunkaKlunka";
        String actual = tractor.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rideTest(){
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor.ride());
    }

    @Test
    public void stopRidingTest(){
        Tractor tractor = new Tractor();
        tractor.ride();
        Assert.assertTrue(tractor.stopRiding());
    }

    @Test
    public void operateTest(){
        Farm farm = new Farm();
        Tractor tractor = new Tractor();
        tractor.ride();
        boolean beforeOperating = tractor.isOperatingOnFarm();
        tractor.operate(farm);
        boolean afterOperating = tractor.isOperatingOnFarm();
        Assert.assertFalse(beforeOperating);
        Assert.assertTrue(afterOperating);
    }

    @Test
    public void harvestTest(){
        Farm farm = new Farm();
        CropRow cropRow = new CropRow();
        for (int i = 0; i < 4; i++) {
            CornStalk cornStalk = new CornStalk();
            cropRow.addCropsToCropRow(cornStalk);
        }
        farm.getField().addCropRowsToCropField(cropRow);
        CropDuster cropDuster = new CropDuster();
        cropDuster.ride();
        cropDuster.fly();
        cropDuster.operate(farm);

        Tractor tractor = new Tractor();
        tractor.ride();
        tractor.operate(farm);
        int expected = 4;
        int actual = tractor.harvest().size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void cannotHarvestAfterAlreadyHarvestingTest(){
        Farm farm = new Farm();
        CropRow cropRow = new CropRow();
        for (int i = 0; i < 4; i++) {
            CornStalk cornStalk = new CornStalk();
            cropRow.addCropsToCropRow(cornStalk);
        }
        farm.getField().addCropRowsToCropField(cropRow);
        CropDuster cropDuster = new CropDuster();
        cropDuster.ride();
        cropDuster.fly();
        cropDuster.operate(farm);

        Tractor tractor = new Tractor();
        tractor.ride();
        tractor.operate(farm);

        //First
        tractor.harvest();

        int expected = 4;
        int actual = tractor.harvest().size();

        Assert.assertEquals(expected,actual);
    }
}
