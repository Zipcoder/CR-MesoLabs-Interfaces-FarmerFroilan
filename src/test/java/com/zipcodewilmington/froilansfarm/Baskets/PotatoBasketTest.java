package com.zipcodewilmington.froilansfarm.Baskets;

import com.zipcodewilmington.froilansfarm.Edibles.Potato;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PotatoBasketTest {

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void addTest(){
        Potato pot = new Potato();
        Basket basket = new Basket<PotatoBasket>();
        basket.add(pot);
        Integer actual = basket.size();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void sizeTest(){
        Potato pot = new Potato();
        Potato pot2 = new Potato();

        Basket basket = new Basket<PotatoBasket>();
        basket.add(pot);
        basket.add(pot2);

        Integer actual = basket.size();
        Integer expected = 2;
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void removeTest(){
        Potato pot = new Potato();
        Potato pot2 = new Potato();

        Basket basket = new Basket<PotatoBasket>();
        basket.add(pot);
        basket.add(pot2);
        basket.remove(1);

        Integer actual = basket.size();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);

    }

    @After
    public void tearDown() throws Exception {
    }
}