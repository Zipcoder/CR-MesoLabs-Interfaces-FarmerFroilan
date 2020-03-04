package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.crop.CarrotRoot;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import org.junit.Assert;
import org.junit.Test;

public class CarrotRootTest {
     CarrotRoot testCarrotRoot = new CarrotRoot();


    @Test
    public void carrotRootTest1() {
        Assert.assertTrue(testCarrotRoot instanceof Crop);
    }

    @Test
    public void carrotRootTest2() {
        Assert.assertTrue(testCarrotRoot instanceof Produce);
    }

    @Test
    public void carrotTest3() {
        Assert.assertFalse(testCarrotRoot.yield());
    }

    @Test
    public void carrotTest4() {
        Assert.assertFalse(testCarrotRoot.storeFood());
    }

    @Test
    public void carrotTest5() {
        Assert.assertFalse(testCarrotRoot.fertilized());
    }

    @Test
    public void carrotTest6() {
        Assert.assertFalse(testCarrotRoot.harvested());
    }

}
