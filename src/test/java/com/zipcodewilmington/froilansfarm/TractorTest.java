package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TractorTest {
    Tractor tractor;
    TomatoPlant tomatoPlant;
    Farmer farmer;

    @Before
    public void setup(){
        tractor = new Tractor();
        tomatoPlant = new TomatoPlant();
        farmer = new Farmer("farmer");
    }

    @Test
    public void setRiderTest(){
        tractor.setRider();
        Assert.assertNull(tractor.getRider());
    }

    @Test
    public void setRiderTest2(){
        tractor.setRider(farmer);
        Assert.assertEquals(tractor.getRider(), farmer);
    }

    @Test
    public void getFuelTest(){
        int expected = 100;
        int actual = tractor.getFuel();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestTest(){
        CropRow cropRow = new CropRow(tomatoPlant);
        tractor.harvest(cropRow);
        Assert.assertTrue(tomatoPlant.isHarvested());
    }

    @Test
    public void harvestFieldTest(){
        PotatoPlant potatoPlant = new PotatoPlant();
        Field field = new Field();
        field.plantCrop(potatoPlant, tomatoPlant);
        tractor.harvest(field);
        Assert.assertTrue(tomatoPlant.isHarvested());
        Assert.assertTrue(potatoPlant.isHarvested());
    }
}
