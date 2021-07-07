package com.zipcodewilmington.froilansfarm.FieldRelated;

import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Produce;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornStalkTest {
    Basket cornBasket;
    CornStalk cornStalk;
    @Before
    public void setUp() throws Exception {
        cornBasket = new Basket<EarCorn>();
        cornStalk = new CornStalk();
    }

    @Test
    public void yieldTest() {
        Integer expected = 1;
        cornBasket.add(cornStalk.yield());
        Integer actual = cornBasket.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void InheritanceTest() {
        Assert.assertTrue(cornStalk instanceof Crop);
    }

    @Test
    public void ImplementantationTest() {
        Assert.assertTrue(cornStalk instanceof Produce);
    }
    @Test
    public void getType() {
        Crop test = new CornStalk();
        test.getType();
        String actual = test.getType();
        String expected = "CornStalks";
        Assert.assertEquals(expected, actual);
    }
}