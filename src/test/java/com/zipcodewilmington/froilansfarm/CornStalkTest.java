package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornStalkTest {

    @Test
    public void yieldTest1() {
        CornStalk cornStalk = new CornStalk(true, true);

        String expected = new Earcorn().getClass().getSimpleName();
        String actual = cornStalk.yield().getClass().getSimpleName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void yieldTest2() {
        CornStalk cornStalk = new CornStalk(false, true);

        String expected = null;
        Edible actual = cornStalk.yield();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void yieldTest3() {
        CornStalk cornStalk = new CornStalk(false, false);

        String expected = null;
        Edible actual = cornStalk.yield();

        Assert.assertEquals(expected, actual);

    }
}