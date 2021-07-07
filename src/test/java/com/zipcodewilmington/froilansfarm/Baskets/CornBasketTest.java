package com.zipcodewilmington.froilansfarm.Baskets;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornBasketTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void addTest(){
        EarCorn corn = new EarCorn();
        Basket basket = new Basket<CornBasket>();
        basket.add(corn);
        Integer actual = basket.size();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void sizeTest(){
        EarCorn corn = new EarCorn();
        EarCorn corn2 = new EarCorn();
        EarCorn corn3 = new EarCorn();
        Basket basket = new Basket<EarCorn>();
        basket.add(corn);
        basket.add(corn2);
        basket.add(corn3);
        Integer actual = basket.size();
        Integer expected = 3;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void constructortest(){
        Basket basket = new Basket<EarCorn>();
        //CornBasket cbasket = new CornBasket(basket);

        Integer actual = basket.size();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest(){
        EarCorn corn = new EarCorn();
        EarCorn corn2 = new EarCorn();
        EarCorn corn3 = new EarCorn();
        Basket basket = new Basket<EarCorn>();
        basket.add(corn);
        basket.add(corn2);
        basket.add(corn3);
        basket.remove(1);
        Integer actual = basket.size();
        Integer expected = 2;
        Assert.assertEquals(expected, actual);

    }


    @After
    public void tearDown() throws Exception {
    }
}