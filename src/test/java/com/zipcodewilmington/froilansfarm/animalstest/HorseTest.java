package com.zipcodewilmington.froilansfarm.animalstest;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {


    @Test
    public void setId() {
        Horse horse1 = new Horse();
        Integer expected = 10;
        horse1.setId(expected);
        Integer actual = horse1.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatFood() {
    }

    @Test
    public void makeNoise() {
    }

    @Test
    public void ride() {
    }

    @Test
    public void stopRiding() {
    }
}
