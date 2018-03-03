package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures;

import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Chicken;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.ChickenFeed;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EdibleType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CreatureTest {

    Creature spanky;
    Edible food;
    WareHouse testHouse;

    @Before
    public void setUp(){
        spanky = new Chicken("Spanky");
        food = new ChickenFeed();
        testHouse = new WareHouse(food);
    }

    @Test
    public void getNameTest(){
        //Given
        //Creature spanky

        //When
        String expected = "Spanky";
        String actual = spanky.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void hasBeenFedTest(){
        //Given
        //Creature spanky
        //ChickenFeed food

        //When
        boolean expected = true;
        spanky.eat(EdibleType.CHICKENFEED,testHouse);
        boolean actual = spanky.hasBeenFed();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getEnergyReservesTest(){
        //Given
        //Creature spanky
        //ChickenFeed food

        //When
        int expected = 2;
        spanky.eat(EdibleType.CHICKENFEED,testHouse);
        int actual = spanky.getEnergyReserves();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void eatTest(){
        //Given
        //Creature spanky
        //ChickenFeed food

        //When
        spanky.eat(EdibleType.CHICKENFEED,testHouse);
        int expected =2;
        int actual = spanky.getEnergyReserves();

        Assert.assertTrue(expected == actual && spanky.hasBeenFed());

    }

    @Test
    public void nullConstructorTest(){
        //Given
        Creature spanky = new Chicken();

        //When
        int expected = 0;
        int actual = spanky.getEnergyReserves();

        //Then
        Assert.assertEquals(expected,actual);
    }

}
