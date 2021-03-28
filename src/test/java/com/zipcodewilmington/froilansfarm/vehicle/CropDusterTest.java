package com.zipcodewilmington.froilansfarm.vehicle;

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
    public void fertilizeTest(){
        CropDuster duster = new CropDuster("Dusty");
        boolean inAir = true;
        CropRow rows = new CropRow();
        duster.fertilize(rows);

    }

}