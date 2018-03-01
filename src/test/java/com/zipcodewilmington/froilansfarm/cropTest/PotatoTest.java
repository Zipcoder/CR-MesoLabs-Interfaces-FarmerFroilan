package com.zipcodewilmington.froilansfarm.cropTest;

import com.zipcodewilmington.froilansfarm.crop.Potato;
import org.junit.Assert;
import org.junit.Test;

public class PotatoTest {

    @Test
    public void getIsEdibleTest(){
        Potato potatoTest = new Potato();
        boolean actual = potatoTest.getIsEdible();
        Assert.assertTrue(actual);
    }
}
