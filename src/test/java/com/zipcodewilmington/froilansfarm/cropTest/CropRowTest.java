package com.zipcodewilmington.froilansfarm.cropTest;

import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.CropRow;

import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {


    @Test
    public void cropRowGetterTest(){
        CropRow cropRowTest = new CropRow();
        CornStalk cornStalkTest = new CornStalk();

        cropRowTest.getCropsInRow().add(cornStalkTest);

        int actual = cropRowTest.getCropsInRow().size();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}
