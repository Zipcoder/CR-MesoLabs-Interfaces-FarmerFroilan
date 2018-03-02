package com.zipcodewilmington.froilansfarm.PeopleTest;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.Production.CornStalk;
import com.zipcodewilmington.froilansfarm.Production.CropRow;
import com.zipcodewilmington.froilansfarm.Production.TomatoPlant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmerTest {

    private Horse testHorse;
    private Farmer testFarmer;
    private Horse testHorse2;
    private TomatoPlant testCrop;
    private CropRow testCropRow;
    private CornStalk anotherTestCrop;

    @Before
    public void setup() {
        testHorse = new Horse();
        testFarmer = new Farmer();
        testHorse2 = new Horse();
        testCrop = new TomatoPlant();
        testCropRow = new CropRow();
        anotherTestCrop = new CornStalk();
    }

    @Test
    public void implementationTest1() {
        Assert.assertTrue(testFarmer instanceof Botanist);
    }

    @Test
    public void implementationTest2() {
        Assert.assertTrue(testFarmer instanceof Eater);
    }

    @Test
    public void implementationTest3() {
        Assert.assertFalse(testFarmer instanceof Edible);
    }

    @Test
    public void mountTest() {
        testFarmer.mount(testHorse);
        boolean expected = true;
        boolean actual = testHorse.getIsMounted();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mountTest2() {
        testFarmer.mount(testHorse2);
        boolean expected = false;
        boolean actual = testHorse.getIsMounted();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mountTest3() {
        testFarmer.mount(testHorse);
        testFarmer.mount(testHorse);
        boolean expected = true;
        boolean actual = testHorse.getIsMounted();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountTest1() {
        testFarmer.mount(testHorse);
        testFarmer.dismount(testHorse2);
        boolean expected = true;
        boolean actual = testHorse.getIsMounted();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountTest2() {
        testFarmer.mount(testHorse2);
        testFarmer.dismount(testHorse2);
        boolean expected = false;
        boolean actual = testHorse2.getIsMounted();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void plantTest1() {
        testFarmer.plant(testCrop, testCropRow);
        int expected = 1;
        int actual = testCropRow.getCropRow().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void plantTest2() {
        testFarmer.plant(testCrop, testCropRow);
        testFarmer.plant(anotherTestCrop, testCropRow);
        int expected = 2;
        int actual = testCropRow.getCropRow().size();
        Assert.assertEquals(expected, actual);
    }


}
