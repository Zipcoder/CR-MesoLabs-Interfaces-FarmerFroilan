package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {
    TomatoPlant testTomatoPlant = new TomatoPlant();

    @Test
    public void tomatoPlantTest1() {
        Assert.assertTrue(testTomatoPlant instanceof Crop);}

    @Test
    public void tomatoPlantTest2() {
        Assert.assertTrue(testTomatoPlant instanceof Produce);}

    @Test
    public void tomatoPlantTest3() { Assert.assertFalse(testTomatoPlant.yield()); }

    @Test
    public void tomatoPlantTest4() { Assert.assertFalse(testTomatoPlant.storeFood()); }

    @Test
    public void tomatoPlantTest5() { Assert.assertFalse(testTomatoPlant.fertilized());}

    @Test
    public void tomatoPlantTest6() {Assert.assertFalse(testTomatoPlant.harvested());}
}

