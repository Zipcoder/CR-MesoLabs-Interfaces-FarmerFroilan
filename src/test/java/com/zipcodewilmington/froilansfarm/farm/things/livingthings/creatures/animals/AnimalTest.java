package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.ChickenFeed;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void eatTest(){
        //Given
        Animal larry = new Chicken("Larry");
        ChickenFeed food = new ChickenFeed();

        //When
        larry.eat(food);
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

        //When
        larry.eat(food);
        int expected = 0;
        int actual = larry.getEnergyReserves();

        //Then
        Assert.assertTrue(expected == actual && !larry.hasBeenFed());
    }


}
