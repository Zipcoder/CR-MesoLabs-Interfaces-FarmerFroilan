package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Plants.CropRow;
import com.zipcodewilmington.froilansfarm.Plants.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class CropdusterTest {

    @Test
    public void fertilizeRowTest() {
        CropDuster cropDuster = new CropDuster();
        CropRow cropRow = new CropRow();
        cropRow.getCropArrayList().add(0, new TomatoPlant());
        cropDuster.fertilize(cropRow);
        Assert.assertTrue(cropRow.getCropArrayList().get(0).isFertilized());
    }

}
