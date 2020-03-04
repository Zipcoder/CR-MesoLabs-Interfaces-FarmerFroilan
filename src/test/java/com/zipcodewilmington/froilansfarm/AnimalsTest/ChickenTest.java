package com.zipcodewilmington.froilansfarm.AnimalsTest;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Production.EarCorn;
import com.zipcodewilmington.froilansfarm.Production.Egg;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {

    Chicken testChicken;

    @Before
    public void setup() {
        testChicken = new Chicken();
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(testChicken instanceof Produce);
    }


    @Test
    public void fertilizeTest1() {
        Assert.assertFalse(testChicken.getHasBeenFertilizedStatus());
    }

    @Test
    public void fertilizeTest2() {
        testChicken.fertilizeChicken();
        Assert.assertTrue(testChicken.getHasBeenFertilizedStatus());
    }

    @Test
    public void yieldTest1() {
        Egg expected = null;
        Egg actual = testChicken.yield();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void yieldTest2() {
        testChicken.fertilizeChicken();
        Assert.assertTrue(testChicken.yield() instanceof Edible);
    }


}
