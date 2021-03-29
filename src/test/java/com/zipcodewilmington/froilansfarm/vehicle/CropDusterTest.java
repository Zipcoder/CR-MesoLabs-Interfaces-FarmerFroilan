package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.shelter.CropRow;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropDusterTest {

    @Test
    public void testCropDuster(){
        CropDuster duster = new CropDuster("Dusty");
        String expected = "Dusty";

        String actual = duster.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testCropDuster2(){
        CropDuster duster = new CropDuster("Dusty");
        String expected = "Dust";

        String actual = duster.getName();

        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void makeNoiseCropDuster(){
        CropDuster duster = new CropDuster("Dusty");
        String expected = "nnneeaoowww";

        String actual = duster.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseCropDuster2(){
        CropDuster duster = new CropDuster("Dusty");
        String expected = "some plane noise";

        String actual = duster.makeNoise();

        Assert.assertNotEquals(expected, actual);
    }
}