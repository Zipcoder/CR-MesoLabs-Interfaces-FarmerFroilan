package com.zipcodewilmington.froilansfarm.FieldRelated;

import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Edibles.Potato;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Produce;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PotatoPlantTest {

    Basket potatoBasket;
    PotatoPlant potatoPlant;
    @Before
    public void setUp() throws Exception {
        potatoBasket = new Basket<Potato>();
        potatoPlant = new PotatoPlant();
    }

    @Test
    public void yieldTest() {
        Integer expected = 1;
        potatoBasket.add(potatoPlant.yield());
        Integer actual = potatoBasket.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void InheritanceTest() {
        Assert.assertTrue(potatoPlant instanceof Crop);
    }

    @Test
    public void ImplementantationTest() {
        Assert.assertTrue(potatoPlant instanceof Produce);
    }
    @Test
    public void getType() {
        Crop test = new PotatoPlant();
        test.getType();
        String actual = test.getType();
        String expected = "Potato Plants";
        Assert.assertEquals(expected, actual);
    }
}