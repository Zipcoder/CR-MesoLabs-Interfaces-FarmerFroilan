package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class farmersLifeTest {

    farmersLife farm2 = new farmersLife();
    @Test
    public void sunday() {
        farm2.sunday();

        Integer actual = farm2.getFarm().getCropRows().get(0).count();
        Integer expected = 10;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void monday() {
        farm2.monday();

        boolean actual = farm2.getFarm().getCropRows().get(0).getHasBeenFertilized();
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tuesday() {
    }

    @Test
    public void wednesday() {
    }

    @Test
    public void thursday() {
    }

    @Test
    public void friday() {
    }

    @Test
    public void saturday() {
    }
}