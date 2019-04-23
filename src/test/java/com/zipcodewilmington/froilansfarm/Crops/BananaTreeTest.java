package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BananaTreeTest {

    BananaTree bananaTree;

    @Before
    public void setup() {
        bananaTree = new BananaTree();
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(bananaTree instanceof Crop);
    }

    @Test
    public void yieldTest() {
        bananaTree.hasBeenHarvested = true;
        bananaTree.hasBeenFertilized = true;

        Class expected = Banana.class;
        Class actual = bananaTree.yield().getClass();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHasBeenHarvestedTest() {
        bananaTree.hasBeenHarvested = false;
        Assert.assertFalse(bananaTree.getHasBeenHarvested());
    }

    @Test
    public void getHasBeenFertilizedTest() {
        bananaTree.hasBeenFertilized = false;
        bananaTree.hasBeenHarvested = true;

        Assert.assertFalse(bananaTree.getHasBeenFertilized());
        Assert.assertTrue(bananaTree.getHasBeenHarvested());
    }

}