package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Baskets.CornBasket;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.PersonRelated.Farmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class HorseTest {
    private Horse horse;
    private Basket cornBasket;
    private EarCorn earCorn;
    private Farmer farmer;


    @Before
    public void setUp() throws Exception {
        horse = new Horse();
        this.cornBasket = new Basket<>();

        earCorn = new EarCorn();
        cornBasket.add(earCorn);
        farmer = new Farmer();
    }

    @Test
    public void mount() {
        horse.mount();
        Assert.assertTrue(horse.getReady());
    }

    @Test
    public void dismount() {
        horse.dismount();
        Assert.assertFalse(horse.getReady());
    }

    @Test
    public void makeNoise() {
        String expected = "horseNoise";
        String actual = horse.makeNoise();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eat() {
//         see how much corn in the basket
        Integer expected = cornBasket.size() ;
        horse.eat(earCorn);
        Integer actual = cornBasket.size();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInheritance() {
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(horse instanceof Ridable);

    }

}