package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CropRowTest {

    CropRow cropRow;

    @Before
    public void setup() {
        cropRow = new CropRow();
    }

    @Test
    public void addCropsTest() {
        Crop tomatoPlant = new TomatoPlant();
        Crop tomatoPlant2 = new TomatoPlant();
        Crop tomatoPlant3 = new TomatoPlant();
        Crop tomatoPlant4 = new TomatoPlant();

        cropRow.addCrops(tomatoPlant);
        cropRow.addCrops(tomatoPlant2);
        cropRow.addCrops(tomatoPlant3);
        cropRow.addCrops(tomatoPlant4);

        List<Crop> expected = Arrays.asList(tomatoPlant, tomatoPlant2, tomatoPlant3, tomatoPlant4);
        List<Crop> actual = cropRow.getCropRow();

        Assert.assertEquals(expected, actual);
    }

}