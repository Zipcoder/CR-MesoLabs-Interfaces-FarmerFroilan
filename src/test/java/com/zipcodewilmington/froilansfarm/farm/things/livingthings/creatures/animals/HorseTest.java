package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals;

import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.Creature;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.ChickenFeed;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EdibleType;
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
        WareHouse testHouse = new WareHouse(new Hay());

        //When
        shadowfax.eat(EdibleType.HAY, testHouse);
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
        WareHouse testHouse = new WareHouse(new Hay());

        //When
        shadowfax.eat(EdibleType.TOMATO,testHouse);
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

    @Test
    public void sleepTest(){
        //Given
        Horse spanky = new Horse("Spanky");
        WareHouse testHouse = new WareHouse (new Hay());

        //When
        spanky.eat(EdibleType.HAY,testHouse);
        spanky.sleep();

        //Then
        Assert.assertFalse(spanky.hasBeenFed());
        Assert.assertTrue (spanky.getEnergyReserves() == 0);
        Assert.assertFalse(spanky.wasExercised());

    }

}
