package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropTest {


    @Test
    public void yieldTest1() {
        Crop crop = new CornStalk(true, true);

        String expected = new Earcorn().getClass().getSimpleName();
        String actual = crop.yield().getClass().getSimpleName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void yieldTest2() {
        Crop crop = new CornStalk(false, true);

        String expected = null;
        Edible actual = crop.yield();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void yieldTest3() {
        Crop crop = new CornStalk(false, false);

        String expected = null;
        Edible actual = crop.yield();

        Assert.assertEquals(expected, actual);

    }
}