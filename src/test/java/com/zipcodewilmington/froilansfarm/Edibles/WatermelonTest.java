package com.zipcodewilmington.froilansfarm.Edibles;

import org.junit.Assert;
import org.junit.Test;

public class WatermelonTest {
    Watermelon testWatermelon = new Watermelon();

    @Test
    public void testIsEdible(){
        boolean actual = testWatermelon.isEdible();
        Assert.assertTrue(actual);
    }
}
