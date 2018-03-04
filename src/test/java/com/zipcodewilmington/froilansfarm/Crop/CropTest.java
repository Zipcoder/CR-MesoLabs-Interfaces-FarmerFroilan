package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public class CropTest {

    private CropDummy dummy;

    @Before
    public void setUp() {
        dummy = new CropDummy();
    }

    @Test
    public void testSetFertilized() {
        Assert.assertFalse(dummy.hasBeenFertilized());
        dummy.setFertilized();
        Assert.assertTrue(dummy.hasBeenFertilized());
    }

    @Test
    public void testSetHarvested() {
        Assert.assertFalse(dummy.hasBeenHarvested());
        dummy.setHarvested();
        Assert.assertTrue(dummy.hasBeenHarvested());
    }

    private class CropDummy extends Crop<Edible> {
        public Edible yield() {
            return null;
        }
    }
}