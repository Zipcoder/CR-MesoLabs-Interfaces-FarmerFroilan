package com.zipcodewilmington.froilansfarm.cropTest;

import com.zipcodewilmington.froilansfarm.crop.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {

    @Test
    public void getIsEdibleTest(){
        Tomato tomatoTest = new Tomato();
        boolean actual = tomatoTest.getIsEdible();
        Assert.assertTrue(actual);
    }
}
