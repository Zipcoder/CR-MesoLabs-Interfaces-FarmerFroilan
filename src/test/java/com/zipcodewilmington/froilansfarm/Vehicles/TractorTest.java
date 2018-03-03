package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class TractorTest {

    Tractor tractor;
    Crop crop;
    Crop crop2;
    CropRow cropRow;

    @Before
    public void setup() {
        tractor = new Tractor();
        crop = new CornStalk();
        crop2 = new TomatoPlant();
        cropRow = new CropRow();
    }

    @Test
    public void harvestCropTest() {
        tractor.harvestCrop(crop);

        boolean expected = true;
        boolean actual = crop.hasBeenHarvested;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mountTractorTest() {
        tractor.mount();

        boolean expected = true;
        boolean actual = tractor.getMountedStatus();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountTractorTest() {
        tractor.mount();
        tractor.dismount();

        boolean expected = false;
        boolean actual = tractor.getMountedStatus();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fertilizeTest() {
        cropRow.addCrops(crop);
        cropRow.addCrops(crop2);

        tractor.fertilize(cropRow);

        Assert.assertTrue(crop.hasBeenFertilized);
        Assert.assertTrue(crop2.hasBeenFertilized);

    }

}