package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/3/18
 */
public class CropRowTest {
    private CropRow cropRow;

    @Before
    public void setup() {
        cropRow = new CropRow();
    }

    @Test
    public void sow() {
        TomatoPlant plant = new TomatoPlant();
        cropRow.sow(plant);
        String expected = plant.getClass().getSimpleName();
        String actual = cropRow.getCrops().get(0).getClass().getSimpleName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fertilizeRow() {
        cropRow.sow(new TomatoPlant());
        cropRow.fertilizeRow();

        Assert.assertTrue(cropRow.getCrops().get(0).hasBeenFertilized());
    }
}