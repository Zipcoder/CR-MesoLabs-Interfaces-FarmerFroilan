package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public class CornStalkTest {
    @Test
    public void testYieldEarCorn() {
        EarCorn earCorn = new EarCorn();
        CornStalk stalk = new CornStalk();
        Assert.assertEquals(earCorn.getClass(), stalk.yield().getClass());
    }
}