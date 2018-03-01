package com.zipcodewilmington.froilansfarm.cropTest;

import com.zipcodewilmington.froilansfarm.crop.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class EarCornTest {

    @Test
    public void getIsEdibleTest(){
        EarCorn earCornTest = new EarCorn();
        boolean actual = earCornTest.getIsEdible();
        Assert.assertTrue(actual);
    }
}
