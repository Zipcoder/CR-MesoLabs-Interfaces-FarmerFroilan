package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Buildings.Farm;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplicationTest {

    @Test
    public void farmGetterTest() {
        MainApplication mainApplication = new MainApplication();
        Assert.assertTrue(mainApplication.getFroilansFarm() instanceof Farm);
    }

    @Test
    public void froilanGetterTest() {
        MainApplication mainApplication = new MainApplication();
        Assert.assertTrue(mainApplication.getFroilan() instanceof Farmer);
    }

    @Test
    public void froilandaGetterTest() {
        MainApplication mainApplication = new MainApplication();
        Assert.assertTrue(mainApplication.getFroilanda() instanceof Pilot);
    }

    @Test
    public void froilansTractorGetterTest() {
        MainApplication mainApplication = new MainApplication();
        Assert.assertTrue(mainApplication.getFroilansTractor() instanceof Tractor);
    }

    @Test
    public void froilandasCropDusterGetterTest() {
        MainApplication mainApplication = new MainApplication();
        Assert.assertTrue(mainApplication.getFroilandasCropDuster() instanceof CropDuster);
    }

    @Test
    public void addFoodsToInventoryUtilityTest() {
        MainApplication mainApplication = new MainApplication();
        mainApplication.beginDay();
        int expected = 150;
        int actual = mainApplication.getFroilan().getFoodInventory().size();
        Assert.assertEquals(expected, actual);
    }

}
