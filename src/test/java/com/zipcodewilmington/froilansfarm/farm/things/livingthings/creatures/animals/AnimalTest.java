package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals;

import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.ChickenFeed;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EdibleType;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void eatTest(){
        //Given
        Animal larry = new Chicken("Larry");
        ChickenFeed food = new ChickenFeed();
        WareHouse testHouse = new WareHouse(food);

        //When
        larry.eat(EdibleType.CHICKENFEED, testHouse);
        int expected = 2;
        int actual = larry.getEnergyReserves();

        //Then
        Assert.assertTrue(expected == actual && larry.hasBeenFed());


    }

    @Test
    public void dontEatPeopleFoodTest(){
        //Given
        Animal larry = new Chicken("Larry");
        Tomato food = new Tomato();
        WareHouse testHouse = new WareHouse(food);

        //When
        larry.eat(EdibleType.TOMATO, testHouse);
        int expected = 0;
        int actual = larry.getEnergyReserves();

        //Then
        Assert.assertTrue(expected == actual && !larry.hasBeenFed());
    }


}
