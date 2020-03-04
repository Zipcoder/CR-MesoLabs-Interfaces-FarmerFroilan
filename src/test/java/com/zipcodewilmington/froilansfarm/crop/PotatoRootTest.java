package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.PotatoRoot;
import org.junit.Assert;
import org.junit.Test;

public class PotatoRootTest {
    PotatoRoot testPotatoRoot = new PotatoRoot();

    @Test
    public void potatoRootTest() {
        Assert.assertTrue(testPotatoRoot instanceof Crop);
    }

    @Test
    public void potatoRootTest2() {
        Assert.assertTrue(testPotatoRoot instanceof Produce);
    }

    @Test
    public void potatoRootTest3() { Assert.assertFalse(testPotatoRoot.yield());}

    @Test
    public void potatoRootTest4() { Assert.assertFalse(testPotatoRoot.storeFood());}

    @Test
    public void potatoRootTest5() {Assert.assertFalse(testPotatoRoot.fertilized());}

    @Test
    public void potatoRootTest6() {Assert.assertFalse(testPotatoRoot.harvested());}
}
