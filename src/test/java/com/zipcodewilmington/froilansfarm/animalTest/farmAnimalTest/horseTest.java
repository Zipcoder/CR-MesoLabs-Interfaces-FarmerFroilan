package com.zipcodewilmington.froilansfarm.animalTest.farmAnimalTest;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Horse;
import org.junit.Assert;
import org.junit.Test;

public class horseTest {

    @Test
    public void testNullaryHorseConstructor(){
        // given
        Boolean expectedRiddenValue = false;
        Integer expectedFoodEaten = 0;

        // When
        Horse horse = new Horse();
        Boolean actualRiddenValue = horse.getHasBeenRiddenToday();
        Integer actualFoodEaten = horse.getFoodEaten();

        // then
        Assert.assertEquals(expectedFoodEaten, actualFoodEaten);
        Assert.assertEquals(expectedRiddenValue, actualRiddenValue);
    }

    @Test
    public void testGetSetRiddenToday(){
        // Given
        Boolean expected = true;
        Horse horse = new Horse();

        // When
        horse.setHasBeenRiddenToday(true);
        Boolean actual = horse.getHasBeenRiddenToday();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSetFoodEaten(){
        // Given
        Integer expected = 1;
        Horse horse = new Horse();

        // When
        horse.eat();
        Integer actual = horse.getFoodEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMakeNoise(){
        // Given
        String expected = "Neigh!";
        Horse horse = new Horse();

        // When
        String actual = horse.makeNoise();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
