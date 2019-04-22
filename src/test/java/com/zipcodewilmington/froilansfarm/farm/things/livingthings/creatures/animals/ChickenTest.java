package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals;

import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {

    Chicken larry;
    ChickenFeed food;
    Hay food2;

    @Before
    public void setUp(){
        larry = new Chicken("Larry");
        food = new ChickenFeed();
        food2 = new Hay();

    }

    @Test
    public void eatTest(){
        //Given
        WareHouse testHouse = new WareHouse(new ChickenFeed());
        larry.eat(EdibleType.CHICKENFEED, testHouse);

        //When
        int expected = 2;
        int actual = larry.getEnergyReserves();

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertTrue(larry.hasBeenFed());
    }

    @Test
    public void dontEatHayTest(){
        //Given
        WareHouse testHouse = new WareHouse(new ChickenFeed());
        larry.eat(EdibleType.HAY, testHouse);

        //When
        int expected = 0;
        int actual = larry.getEnergyReserves();

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertFalse(larry.hasBeenFed());
    }

    @Test
    public void makeNoiseTest(){
        //Given
        //Chicken larry

        //When
        String expected = "bucKAW!!!";
        String actual = larry.makeNoise();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void fertilzeTest(){
        //Given
        //Chicken larry

        //When
        larry.fertilize();

        //Then
        Assert.assertTrue(larry.isFertilized());
    }

    @Test
    public void harvestTest(){
        //Given
        //Chicken larry

        //When
        larry.harvest();

        //Then
        Assert.assertTrue(larry.isHarvested());
    }

    @Test
    public void successfulYieldTest(){
        //Given
        //Chicken larry


        //When
        larry.harvest();

        //Then
        Assert.assertTrue(larry.yield() instanceof Egg);
    }

    @Test
    public void unsuccessfulYieldTest(){
        //Given
        //Chicken larry

        //When
        larry.fertilize();
        larry.harvest();

        //Then
        Assert.assertTrue(larry.yield() == null);
    }


}
