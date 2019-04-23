package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EarCornTest {

    EarCorn earCorn;

    @Before
    public void setup() {
        earCorn = new EarCorn();
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(earCorn instanceof Edible);
    }

}