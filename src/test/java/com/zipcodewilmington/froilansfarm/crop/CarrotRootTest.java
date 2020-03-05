package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.crop.CarrotRoot;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.food.Carrot;
import org.junit.Assert;
import org.junit.Test;

public class CarrotRootTest {
     CarrotRoot testCarrotRoot = new CarrotRoot();


    @Test
    public void carrotRootCropTest1() {
        Assert.assertTrue(testCarrotRoot instanceof Crop);
    }

    @Test
    public void carrotRootProduceTest() {
        Assert.assertTrue(testCarrotRoot instanceof Produce);
    }

    @Test
    public void carrotRootYieldTest() {
        Carrot testCarrot = new Carrot();
        CarrotRoot testCarrotRoot = new CarrotRoot();
        Carrot expected = testCarrot;
        CarrotRoot actual = testCarrotRoot.fertilized;
        Assert.assertEquals(expected, actual);
    }

    //@Test




}
