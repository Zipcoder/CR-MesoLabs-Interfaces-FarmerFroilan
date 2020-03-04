package com.zipcodewilmington.froilansfarm.farmlandtest;

import com.zipcodewilmington.froilansfarm.farmland.CropRow;
import com.zipcodewilmington.froilansfarm.farmland.Field;
import com.zipcodewilmington.froilansfarm.food.Carrot;
import com.zipcodewilmington.froilansfarm.food.Crop;
import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {


    @Test
    public void testAddCropRows(){
        CropRow cropRow = new CropRow();
        Crop crop = new Crop(){};
        Assert.assertTrue(cropRow.addCropsToCropRow(crop));
    }

    @Test
    public void testCropRowSize(){
        CropRow cropRow = new CropRow();
        Crop crop = new Crop(){};
        for (int i = 0; i < 4; i++) {
            cropRow.addCropsToCropRow(crop);
        }
        int expected = 4;
        int actual = cropRow.getCropRowSize();
        Assert.assertEquals(expected,actual);
    }


}
