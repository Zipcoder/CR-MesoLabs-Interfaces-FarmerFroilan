package com.zipcodewilmington.froilansfarm.Baskets;

import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoBasketTest {

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void addTest(){
        Tomato tom = new Tomato();
        Basket basket = new Basket<TomatoBasket>();
        basket.add(tom);
        Integer actual = basket.size();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void sizeTest(){
       Tomato tom = new Tomato();
        Tomato tom2 = new Tomato();
        Tomato tom3 = new Tomato();
        Basket basket = new Basket<TomatoBasket>();
        basket.add(tom);
        basket.add(tom2);
        basket.add(tom3);
        Integer actual = basket.size();
        Integer expected = 3;
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void removeTest(){
        Tomato tom = new Tomato();
        Tomato tom2 = new Tomato();
        Tomato tom3 = new Tomato();
        Basket basket = new Basket<TomatoBasket>();
        basket.add(tom);
        basket.add(tom2);
        basket.add(tom3);
        basket.remove(2);
        Integer actual = basket.size();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);

    }


    @After
    public void tearDown() throws Exception {
    }
}