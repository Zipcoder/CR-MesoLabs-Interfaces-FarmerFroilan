package com.zipcodewilmington.froilansfarm.AnimalsTest;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EarCorn;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Egg;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void eatTestEarCorn() {
        // Arrange
        String expected = "Peck Peck";
        Chicken testChicky = new Chicken();
        EarCorn testCorn = new EarCorn();
        // Act
        String returned = testChicky.eat(testCorn);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void eatTestEgg() {  // Chicken should not be able to eat an egg
        // Arrange
        String expected = "Peck Peck";
        Chicken testChicky = new Chicken();
        Egg testEgg = new Egg();
        // Act
        String returned = testChicky.eat(testEgg);
        // Assert
        Assert.assertNotEquals(expected, returned);
    }

    @Test
    public void makeNoiseTest1() {
        // Arrange
        String expected = "Bok Bok!";
        Chicken testChicky = new Chicken();
        // Act
        String returned = testChicky.makeNoise();
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void makeNoiseTest2() {
        // Arrange
        String expected = "Woof!";
        Chicken testChicky = new Chicken();
        // Act
        String returned = testChicky.makeNoise();
        // Assert
        Assert.assertNotEquals(expected, returned);
    }

    @Test
    public void addProduce() {
        // Arrange

        // Act

        // Assert
    }
}
