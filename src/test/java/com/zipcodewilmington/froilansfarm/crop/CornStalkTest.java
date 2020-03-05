package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {
    CornStalk testCornStalk = new CornStalk();

    @Test
    public void cornStalkTest1() {
        Assert.assertTrue(testCornStalk instanceof Crop);
    }

    @Test
    public void cornStalkTest2() {
        Assert.assertTrue(testCornStalk instanceof Produce);
    }

}
