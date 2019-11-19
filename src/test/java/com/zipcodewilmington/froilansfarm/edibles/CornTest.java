package com.zipcodewilmington.froilansfarm.edibles;

import org.junit.Assert;
import org.junit.Test;

public class CornTest {

    @Test
    public void inheritanceTest(){
        Corn corn = new Corn();
        Assert.assertTrue(corn instanceof Edibles);
    }

}