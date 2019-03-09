package com.zipcodewilmington.froilansfarm.animalTest.farmAnimalTest;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.factories.AnimalFactory;
import com.zipcodewilmington.froilansfarm.factories.ChickenFactory;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import org.junit.Assert;
import org.junit.Test;


import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ChickenTest {
    private Edible edible;



    // TODO - Create tests for `makeNoise`

    @Test
    public void makeNoiseTest() {
        //given
        ChickenFactory chickenFactory = new ChickenFactory();
        Chicken chicken = AnimalFactory.createChicken();
        String expected = "Cluck!";

        //when
        String actual = chicken.makeNoise();

        //then
        Assert.assertEquals(expected, actual);

    }


    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatTest() {
        // Given
        ChickenFactory chickenFactory = new ChickenFactory();
        Chicken chicken = AnimalFactory.createChicken();
        Integer expected = 2;

        // When
        chicken.eat(edible);
        chicken.eat(edible);
        HashMap<Edible, Integer> foodEaten = chicken.getFood();
        Integer actual = foodEaten.get(edible);

        // Then
        Assert.assertEquals(expected, actual);


    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testAnimalInheritance() {
        //given
        ChickenFactory chickenFactory = new ChickenFactory();
        Chicken chicken = new Chicken();
        AnimalFactory.createChicken();
        boolean expected = true;

        //when
        boolean actual = chicken instanceof Animal;

        //then
        Assert.assertEquals(expected, actual);
    }


}
