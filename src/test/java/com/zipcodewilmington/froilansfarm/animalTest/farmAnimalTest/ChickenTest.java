package com.zipcodewilmington.froilansfarm.animalTest.farmAnimalTest;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.factories.ChickenFactory;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import org.junit.Assert;
import org.junit.Test;


import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ChickenTest {
    private String gender;
    private Edible food;
    private Boolean defeatheredAndPrepared = true;


    // TODO - Create tests for `makeNoise`

    @Test
    public void makeNoiseTest() {
        //given
        ChickenFactory chickenFactory = new ChickenFactory();
        Chicken chicken = new Chicken(gender);
        chickenFactory.createChicken(chicken, gender);
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
        Chicken chicken = new Chicken(gender);
        chickenFactory.createChicken(chicken, gender);
        Integer expected = 2;

        // When
        chicken.eat(food);
        chicken.eat(food);
        HashMap<Edible, Integer> foodEaten = chicken.getFood();
        Integer actual = foodEaten.get(food);

        // Then
        Assert.assertEquals(expected, actual);


    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testAnimalInheritance() {
        //given
        ChickenFactory chickenFactory = new ChickenFactory();
        Chicken chicken = new Chicken(gender);
        chickenFactory.createChicken(chicken, gender);
        boolean expected = true;

        //when
        boolean actual = chicken instanceof Animal;

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsEdible(){
        //Given
        ChickenFactory chickenFactory = new ChickenFactory();
        Chicken chicken = new Chicken(gender);
        chickenFactory.createChicken(chicken, gender);
        Boolean expected = true;

        //When
        Boolean actual = chicken.isEdible(defeatheredAndPrepared);

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testIsEdible2(){
        //Given
        ChickenFactory chickenFactory = new ChickenFactory();
        Chicken chicken = new Chicken(gender);
        chickenFactory.createChicken(chicken, gender);
        Boolean expected = false;

        //When
        Boolean actual = chicken.isEdible(false);

        //Then
        Assert.assertEquals(expected,actual);
    }

}
