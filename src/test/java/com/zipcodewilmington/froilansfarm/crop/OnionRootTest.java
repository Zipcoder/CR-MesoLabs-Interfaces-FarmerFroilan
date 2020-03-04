package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.OnionRoot;
import org.junit.Assert;
import org.junit.Test;

public class OnionRootTest {
    OnionRoot testOnionRoot = new OnionRoot();

    @Test
    public void onionRootTest1() {
        Assert.assertTrue(testOnionRoot instanceof Crop);
    }

    @Test
    public void onionRootTest2() {
        Assert.assertTrue(testOnionRoot instanceof Produce);
    }

    @Test
    public void onionRootTest3() { Assert.assertFalse(testOnionRoot.yield()); }

    @Test
    public void onionRootTest4() { Assert.assertFalse(testOnionRoot.storeFood()); }

    @Test
    public void onionRootTest5() {Assert.assertFalse(testOnionRoot.fertilized());}

    @Test
    public void onionRootTest6() {Assert.assertFalse(testOnionRoot.harvested());}
}
