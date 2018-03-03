package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Plants.Field;
import org.junit.Assert;
import org.junit.Test;

public class FieldTest {

    @Test
    public void fieldConstructTest() {
        Field field = new Field(5);
        Assert.assertEquals(5, field.getCropRows().length);
    }

}
