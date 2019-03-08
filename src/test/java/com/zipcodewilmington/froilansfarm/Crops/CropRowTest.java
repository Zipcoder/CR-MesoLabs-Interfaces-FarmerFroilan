package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropRowTest {
    CropRow row;
    PotatoPlant potatoPlant;
    CornStalk cornStalk;

    @Before
    public void setup(){
        row = new CropRow();
        potatoPlant = new PotatoPlant();
        cornStalk = new CornStalk();
    }

    @Test
    public void plantCropsTest(){
        row.plantCrops(potatoPlant);
        Crop actual = row.getCrops();
        Assert.assertEquals(potatoPlant, actual);
    }

    @Test
    public void plantNewCropsTest(){
        row.plantCrops(potatoPlant);
        row.plantCrops(cornStalk);
        Crop actual = row.getCrops();
        Assert.assertEquals(cornStalk, actual);
    }

    @Test
    public void uprootTest() {
        row.plantCrops(potatoPlant);
        row.uproot();
        Assert.assertNull(row.getCrops());
    }
}
