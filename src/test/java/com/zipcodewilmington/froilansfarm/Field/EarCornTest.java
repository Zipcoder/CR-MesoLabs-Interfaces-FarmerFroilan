package com.zipcodewilmington.froilansfarm.Field;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EarCornTest {

    @Test
    public void EarCornTest(){
        EarCorn earCornTest = new EarCorn();

        boolean expected = true;
        boolean actual = earCornTest.IsEdible();

        Assert.assertEquals(expected, actual);
    }

}