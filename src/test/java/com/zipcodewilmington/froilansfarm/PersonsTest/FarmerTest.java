package com.zipcodewilmington.froilansfarm.PersonsTest;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Egg;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Pumpkin;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void nulleryContructor1() {
        // Arrange
        Farmer testFarmer = new Farmer();
        String expectedName = "Sally";
        // Act
        testFarmer.setName(expectedName);
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertEquals(expectedName, returnedName);
    }

    @Test
    public void nulleryContructor2() {
        // Arrange
        Farmer testFarmer = new Farmer();
        String expectedName = "Sally";
        // Act
        testFarmer.setName(expectedName);
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertNotEquals("Jim-Bob Jr.", returnedName);
    }

    @Test
    public void ConstructorTestName1() {
        // Arrange
        String expectedName = "Darrell";
        Farmer testFarmer = new Farmer(expectedName);
        // Act
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertEquals(expectedName, returnedName);
    }

    @Test
    public void ConstructorTestName2() {
        // Arrange
        String expectedName = "Darrell";
        Farmer testFarmer = new Farmer(expectedName);
        // Act
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertNotEquals("Bobby Joe", returnedName);
    }

    @Test
    public void setNameTest1() {
        // Arrange
        String givenName = "Darrell";
        Farmer testFarmer = new Farmer(givenName);
        // Act
        testFarmer.setName("Dolly");
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertEquals("Dolly", returnedName);
    }

    @Test
    public void setNameTest2() {
        // Arrange
        String expectedName = "Darrell";
        Farmer testFarmer = new Farmer(expectedName);
        // Act
        testFarmer.setName("Dolly");
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertNotEquals("Bobby Joe", returnedName);
    }

    @Test
    public void getNameTest1() {
        // Arrange
        String expectedName = "Darrell";
        Farmer testFarmer = new Farmer(expectedName);
        // Act
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertEquals("Darrell", returnedName);
    }

    @Test
    public void getNameTest2() {
        // Arrange
        String expectedName = "Darrell";
        Farmer testFarmer = new Farmer(expectedName);
        // Act
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertNotEquals("Bobby Joe", returnedName);
    }

    @Test
    public void makeNoiseTest1() {
        // Arrange
        String expected = "E-I-E-I-O";
        Farmer testFarmer = new Farmer();
        // Act
        String returned = testFarmer.makeNoise();
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void makeNoiseTest2() {
        // Arrange
        String expected = "I'm on a boat";
        Farmer testFarmer = new Farmer();
        // Act
        String returned = testFarmer.makeNoise();
        // Assert
        Assert.assertNotEquals(expected, returned);
    }

    @Test
    public void eatTestEgg() {
        // Arrange
        String expected = "This food is downright edible!";
        Farmer testFarmer = new Farmer();
        Egg testEgg = new Egg();
        // Act
        String returned = testFarmer.eat(testEgg);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void eatTestApple() {
        // Arrange
        String expected = "This food is downright edible!";
        Farmer testFarmer = new Farmer();
        Apple testApple = new Apple();
        // Act
        String returned = testFarmer.eat(testApple);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void eatTestPumpkin() {
        // Arrange
        String expected = "This food is downright edible!";
        Farmer testFarmer = new Farmer();
        Pumpkin testPumpkin = new Pumpkin();
        // Act
        String returned = testFarmer.eat(testPumpkin);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void mountTest1() {
        // Arrange
        String expected = "";//this.name + " gets on the " + obj + ".";
        Farmer testFarmer = new Farmer("George");
        Horse testHorse = new Horse();
        // Act
        String returned = testFarmer.mount(testHorse);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void mountTest2() {
        // Arrange
        Farmer testFarmer = new Farmer("Geralt");
        Horse testHorse = new Horse();
        String expected = "Geralt" + " gets on the " + testHorse + ".";
        // Act
        String returned = testFarmer.mount(testHorse);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void dismountTest1() {
        // Arrange

        Farmer testFarmer = new Farmer("Geralt");
        Horse testHorse = new Horse();
        // Act
        String returned = testFarmer.dismount(testHorse);
        String expected = "";//this.name + " gets on the " + obj + ".";
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void dismountTest2() {
        // Arrange

        Farmer testFarmer = new Farmer("Geralt");
        Horse testHorse = new Horse();
        // Act
        String returned = testFarmer.dismount(testHorse);
        String expected = "";//this.name + " gets on the " + obj + ".";
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void plant() {
    }

}
