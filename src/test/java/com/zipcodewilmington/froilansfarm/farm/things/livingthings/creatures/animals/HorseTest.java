package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Egg;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Hay;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HorseTest {

    Horse shadowfax;
    Hay food;
    Egg food2;

    @Before
    public void setUp(){
        shadowfax = new Horse("Shadowfax");
        food = new Hay();
        food2 = new Egg();

    }

    @Test
    public void eatHayTest(){
        //Given
        //Horse shadowfax

        //When
        shadowfax.eat(food);
        int expected = 2;
        int actual = shadowfax.getEnergyReserves();

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertTrue(shadowfax.hasBeenFed());
    }

    @Test
    public void dontEatPeopleFoodTest(){
        //Given
        //Horse shadowfax

        //When
        shadowfax.eat(food2);
        int expected = 0;
        int actual = shadowfax.getEnergyReserves();

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertFalse(shadowfax.hasBeenFed());
    }

    @Test
    public void riderGetsOnTest(){
        //Given
        //Horse shadowfax

        //When
        shadowfax.getOn();

        //Then
        Assert.assertTrue(shadowfax.isBeingRidden());

    }

    @Test
    public void riderGetsOffTest(){
        //Given
        //Horse shadowfax

        //When
        shadowfax.getOn();
        shadowfax.getOff();

        //Then
        Assert.assertFalse(shadowfax.isBeingRidden());

    }

    @Test
    public void makeNoiseTest(){
        //Given
        //Horse shadowfax

        //When
        String expected = "neeeeEEEEIIIIIIGGGGGGGhhhhhhh!!!";
        String actual = shadowfax.makeNoise();

        //Then
        Assert.assertEquals(expected,actual);
    }

}
