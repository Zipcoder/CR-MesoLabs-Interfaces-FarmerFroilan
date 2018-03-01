package com.zipcodewilmington.froilansfarm.cropTest;

import com.zipcodewilmington.froilansfarm.crop.CropRow;
import com.zipcodewilmington.froilansfarm.crop.Field;
import org.junit.Assert;
import org.junit.Test;

public class FieldTest {

    @Test
    public void cropRowGetterTest(){
        CropRow cropRowTest = new CropRow();
        Field.getCropRowsInField()[0] = cropRowTest;
        CropRow expected = cropRowTest;
        CropRow actual = Field.getCropRowsInField()[0];
        Assert.assertEquals(actual, expected);

    }
}
