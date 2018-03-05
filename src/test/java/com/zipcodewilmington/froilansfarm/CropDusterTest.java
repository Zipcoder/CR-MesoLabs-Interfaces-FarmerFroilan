package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropDusterTest {
    CropDuster cropDuster;
    Farmer farmer;
    TomatoPlant tomatoPlant;
    Field field;

    @Before
    public void setup(){
        cropDuster = new CropDuster();
        farmer = new Farmer("farmer");
        tomatoPlant = new TomatoPlant();
        field = new Field();
    }

    @Test
    public void setRiderTest(){
        farmer.mount(cropDuster);
        Assert.assertEquals(farmer, cropDuster.getPilot());
    }

    @Test
    public void makeNoiseTest(){
        String actual = cropDuster.makeNoise();
        String expected = "Zoom";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fertilizeTest(){
        field.plantCrop(tomatoPlant);
        cropDuster.fertilize(field);
        Assert.assertTrue(tomatoPlant.isFertilized);
    }
}
