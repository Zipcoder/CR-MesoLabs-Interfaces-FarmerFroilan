package com.zipcodewilmington.froilansfarm.Edibles;

import org.junit.Assert;
import org.junit.Test;

public class EarCornTest {

    EarCorn testEarCorn = new EarCorn();

    @Test
    public void testIsEdible(){
        boolean actual = testEarCorn.isEdible();
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

}
