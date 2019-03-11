package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void testYield(){
        //Given
        CornStalk cornStalk = new CornStalk();

        //When
        Assert.assertTrue(cornStalk.yield() instanceof EarCorn);
    }
}
