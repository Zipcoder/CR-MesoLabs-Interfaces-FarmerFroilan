package com.zipcodewilmington.froilansfarm.Baskets;

import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EggBasketTest {

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void addTest(){
        Egg corn = new Egg();
        Basket basket = new Basket<EggBasket>();
        basket.add(corn);
        Integer actual = basket.size();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void sizeTest(){
        Egg egg= new Egg();
        Egg egg2 = new Egg();
        Egg egg3 = new Egg();
        Basket basket = new Basket<CornBasket>();
        basket.add(egg);
        basket.add(egg2);
        basket.add(egg3);
        Integer actual = basket.size();
        Integer expected = 3;
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void removeTest(){
        Egg egg= new Egg();
        Egg egg2 = new Egg();
        Egg egg3 = new Egg();
        Basket basket = new Basket<CornBasket>();
        basket.add(egg);
        basket.add(egg2);
        basket.add(egg3);
        basket.remove(1);
        Integer actual = basket.size();
        Integer expected = 2;
        Assert.assertEquals(expected, actual);

    }



    @After
    public void tearDown() throws Exception {
    }
}