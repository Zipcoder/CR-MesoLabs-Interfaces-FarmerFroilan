package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CropRowTest {

    @Test
    public void getCrops() {
        CropRow cropRow = new CropRow();
        ArrayList<Crop> crops = new ArrayList<Crop>();

        Crop tomatoPlant1 = new TomatoPlant(true, true);
        cropRow.addCrop(tomatoPlant1);

        int expected = 1;
        int actual  = cropRow.getCrops().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setCrops() {
        CropRow cropRow = new CropRow();
        ArrayList<Crop> crops = new ArrayList<Crop>();
        cropRow.setCrops(crops);
        Crop tomatoPlant1 = new TomatoPlant(true, true);
        cropRow.addCrop(tomatoPlant1);

        Crop tomatoPlant2 = new TomatoPlant(true, true);
        cropRow.addCrop(tomatoPlant2);

        int expected = 2;
        int actual  = cropRow.getCrops().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addCrop() {
        CropRow cropRow = new CropRow();
        ArrayList<Crop> crops = new ArrayList<Crop>();

        Crop tomatoPlant1 = new TomatoPlant(true, true);
        cropRow.addCrop(tomatoPlant1);

        Crop tomatoPlant2 = new TomatoPlant(true, true);
        cropRow.addCrop(tomatoPlant2);

        Crop tomatoPlant3 = new TomatoPlant(true, true);
        cropRow.addCrop(tomatoPlant3);

        int expected = 3;
        int actual  = cropRow.getCrops().size();

        Assert.assertEquals(expected, actual);
    }
}