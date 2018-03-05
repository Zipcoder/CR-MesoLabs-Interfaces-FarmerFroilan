package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoosterTest {
    Rooster rooster;
    Chicken chicken;

    @Before
    public void setup(){
        rooster = new Rooster();
        chicken = new Chicken();
    }

    @Test
    public void fertilizeTest(){
        rooster.fertilize(chicken);
        Assert.assertTrue(chicken.isFertilized);
    }

}
