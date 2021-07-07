package com.zipcodewilmington.froilansfarm.FieldRelated;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropTest {

    @Test
    public void getType() {
        Crop test = new Crop();
        test.getType();
        String actual = test.getType();
        String expected = null;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void yield() {
        Crop test = new Crop();
        Edible test2 = test.yield();
        test2.getClass();
        String actual = test2.getClass().getSimpleName().toString();
        String expected = "Edible";
        Assert.assertEquals(expected, actual);

    }
}