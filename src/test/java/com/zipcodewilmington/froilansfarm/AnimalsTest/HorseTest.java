package com.zipcodewilmington.froilansfarm.AnimalsTest;


import com.zipcodewilmington.froilansfarm.Animals.Horse;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EarCorn;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Egg;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void makeNoiseTest1() {
        // Arrange
        String expected = "Neeeighhh!";
        Horse testHorsey = new Horse();
        // Act
        String returned = testHorsey.makeNoise();
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void makeNoiseTest2BokBok() {
        // Arrange
        String expected = "Bok Bok!";
        Horse testHorsey = new Horse();
        // Act
        String returned = testHorsey.makeNoise();
        // Assert
        Assert.assertNotEquals(expected, returned);
    }

    @Test
    public void eatTestEgg() {
        // Arrange
        String expected = "munch munch munch";
        Horse testHorsey = new Horse();
        Egg testEgg = new Egg();
        // Act
        String returned = testHorsey.eat(testEgg);
        // Assert
        Assert.assertNotEquals(expected, returned);
    }

    @Test
    public void eatTestEarCorn() {
        // Arrange
        String expected = "munch munch munch";
        Horse testHorsey = new Horse();
        EarCorn testEarCorn = new EarCorn();
        // Act
        String returned = testHorsey.eat(testEarCorn);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void eatTestApple() {
        // Arrange
        String expected = "munch munch munch";
        Horse testHorsey = new Horse();
        Apple testApple = new Apple();
        // Act
        String returned = testHorsey.eat(testApple);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void eatTestTomato() {
        // Arrange
        String expected = "munch munch munch";
        Horse testHorsey = new Horse();
        Tomato testTomato = new Tomato();
        // Act
        String returned = testHorsey.eat(testTomato);
        // Assert
        Assert.assertNotEquals(expected, returned);
    }
}
