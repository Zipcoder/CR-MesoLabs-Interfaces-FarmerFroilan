package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.Plants.CropRow;
import com.zipcodewilmington.froilansfarm.Plants.Tomato;
import com.zipcodewilmington.froilansfarm.Plants.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicles.Harvester;
import org.junit.Assert;
import org.junit.Test;

public class HarvesterTest {

    // Man this thing's fuckin stupid

    @Test
    public void fertilizeCropRowTest() {
        Farmer farmer = new Farmer("Farmer guy");
        Harvester harvester = new Harvester();
        CropRow cropRow = new CropRow();
        cropRow.getCropArrayList().add(new TomatoPlant());
        farmer.mount(harvester);
        harvester.fertilize(cropRow);
        Assert.assertTrue(cropRow.getCropArrayList().get(0).isFertilized());
    }

    @Test
    public void harvestCropRowTest() {
        Farmer farmer = new Farmer("Farmer guy");
        Harvester harvester = new Harvester();
        CropRow cropRow = new CropRow();
        cropRow.getCropArrayList().add(new TomatoPlant());
        farmer.mount(harvester);
        harvester.fertilize(cropRow);
        harvester.harvestCropRow(cropRow, farmer);
        Assert.assertTrue(farmer.getFoodInventory().get(0) instanceof Tomato);
    }

}
