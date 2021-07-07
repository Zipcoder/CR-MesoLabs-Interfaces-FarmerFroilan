package com.zipcodewilmington.froilansfarm.FieldRelated;

import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Produce;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoPlantTest {

    Basket tomatoBasket;
    TomatoPlant tomatoPlant;
    @Before
    public void setUp() throws Exception {
        tomatoBasket = new Basket<Tomato>();
        tomatoPlant = new TomatoPlant();
    }

    @Test
    public void yieldTest() {
        //tomatoBasket.add(tomato);
        Integer expected = 1;
        tomatoBasket.add(tomatoPlant.yield());
        Integer actual = tomatoBasket.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void InheritanceTest() {
        Assert.assertTrue(tomatoPlant instanceof Crop);
    }

    @Test
    public void ImplementantationTest() {
        Assert.assertTrue(tomatoPlant instanceof Produce);
    }
    @Test
    public void getType() {
        Crop test = new TomatoPlant();
        test.getType();
        String actual = test.getType();
        String expected = "Tomato Plants";
        Assert.assertEquals(expected, actual);
    }
}