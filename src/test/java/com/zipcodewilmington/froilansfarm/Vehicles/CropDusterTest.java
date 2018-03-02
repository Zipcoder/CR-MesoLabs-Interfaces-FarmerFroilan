package com.zipcodewilmington.froilansfarm.Vehicles;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CropDusterTest {

    CropDuster cropDuster;
    CropRow cropRow;

    @Before
    public void setup() {
        cropDuster = new CropDuster();
        cropRow = new CropRow();
    }

    @Test
    public void vehicleInheritanceTest() {
        Assert.assertTrue(cropDuster instanceof FarmVehicle);
    }

    @Test
    public void aircraftExtendsTest() {
        Assert.assertTrue(cropDuster instanceof Aircraft);
    }

    @Test
    public void makeNoiseTest() {
        String expected = "Swoosh";
        String actual = cropDuster.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fertilizeTest() {

        TomatoPlant tomatoPlant = new TomatoPlant();
        TomatoPlant tomatoPlant2 = new TomatoPlant();

        cropRow.addCrops(tomatoPlant);
        cropRow.addCrops(tomatoPlant2);

        cropDuster.fertilize(cropRow);

        boolean expected = true;
        boolean actual1 = cropRow.getCropRow().get(0).hasBeenFertilized;
        boolean actual2 = cropRow.getCropRow().get(1).hasBeenFertilized;

        Assert.assertEquals(expected, actual1);
        Assert.assertEquals(expected, actual2);
    }

}
