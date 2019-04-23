package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BananaTest {

    Banana banana;

    @Before
    public void setup() {
        banana = new Banana();
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(banana instanceof Edible);
    }

}