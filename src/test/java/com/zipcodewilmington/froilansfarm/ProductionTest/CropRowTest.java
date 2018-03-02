package com.zipcodewilmington.froilansfarm.ProductionTest;

import com.zipcodewilmington.froilansfarm.Production.CornStalk;
import com.zipcodewilmington.froilansfarm.Production.CropRow;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropRowTest {

    CropRow testCropRow;
    CornStalk testCrop;

    @Before
    public void setup() {
        testCropRow = new CropRow();
        testCrop = new CornStalk();
    }

    @Test
    public void addCropRowTest() {
        testCropRow.addCrop(testCrop);
        int expected = 1;
        int actual = testCropRow.getCropRow().size();
        Assert.assertEquals(expected, actual);
    }
}
