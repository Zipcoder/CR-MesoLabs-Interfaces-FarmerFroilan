package com.zipcodewilmington.froilansfarm.TestVehicles;

import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class TestCropDuster {
    @Test
    public void testInheritanceAirCraft(){
        //Arrange
        CropDuster duster = new CropDuster();

        //Assertion
        Assert.assertTrue(duster instanceof Aircraft);
    }
    @Test
    public void testImplementsVehicle(){
        //Arrange
        CropDuster duster = new CropDuster();

        //Assertion
        Assert.assertTrue(duster instanceof Vehicle);
    }
    @Test
    public void testMakeNoise(){
        //Arrange
        CropDuster duster = new CropDuster();

        //Action
        String expected = "NnNnNn";
        String actual = duster.makeNoise();

        //Assertion
        Assert.assertEquals(expected,actual);
    }
}
