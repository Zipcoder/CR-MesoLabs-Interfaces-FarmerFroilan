package com.zipcodewilmington.froilansfarm.Edibles;

import org.junit.Assert;
import org.junit.Test;

public class EggTest {

    EdibleEgg testEdibleEgg = new EdibleEgg();

    @Test
    public void testEdibleEgg(){
        boolean actual = testEdibleEgg.isEdible();
        Assert.assertTrue(actual);
    }
}
