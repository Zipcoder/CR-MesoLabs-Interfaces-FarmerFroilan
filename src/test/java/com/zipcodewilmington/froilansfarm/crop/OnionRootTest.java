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

}
