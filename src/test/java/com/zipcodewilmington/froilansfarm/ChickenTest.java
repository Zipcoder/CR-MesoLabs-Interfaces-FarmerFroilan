package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Baskets.CornBasket;
import com.zipcodewilmington.froilansfarm.Baskets.EggBasket;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {
    private Chicken chicken;
    private Basket cornBasket;
    private EarCorn earCorn;
    private Basket eggBasket;


    @Before
    public void setUp() throws Exception {
        chicken = new Chicken();
        cornBasket = new Basket<EarCorn>();
        earCorn = new EarCorn();
        eggBasket = new Basket<Egg>();
    }

    @Test
    public void makeNoise() {
        String expected = "chickenNoise";
        String actual = chicken.makeNoise();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void makeNoise1() {
        String expected = "wrongNoise";
        String actual = chicken.makeNoise();
        Assert.assertFalse(expected.equals(actual));
    }

    @Test
    public void yield() {
        Integer expected = eggBasket.size() + 1;
        chicken.yield();
        Integer actual = eggBasket.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eat() {
        Integer expected = cornBasket.size();
        Integer actual = cornBasket.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(chicken instanceof Produce);

    }

}