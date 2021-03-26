package com.zipcodewilmington.froilansfarm.PersonsTest;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Egg;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Pumpkin;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    @Test
    public void makeNoiseTest1() {
        // Arrange
        String expected = "Everyone has oceans to fly, if they have the heart to do it. Is it reckless? Maybe. But what do dreams know of boundaries?";
        Pilot testPilot = new Pilot();
        // Act
        String returned = testPilot.makeNoise();
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void makeNoiseTest2() {
        // Arrange
        String expected = "I'm on a boat";
        Pilot testPilot = new Pilot();
        // Act
        String returned = testPilot.makeNoise();
        // Assert
        Assert.assertNotEquals(expected, returned);
    }

    @Test
    public void eatTestEgg() {
        // Arrange
        String expected = "Yum, this food is tasty";
        Pilot testPilot = new Pilot();
        Egg testEgg = new Egg();
        // Act
        String returned = testPilot.eat(testEgg);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void eatTestApple() {
        // Arrange
        String expected = "Yum, this food is tasty";
        Pilot testPilot = new Pilot();
        Apple testApple = new Apple();
        // Act
        String returned = testPilot.eat(testApple);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void eatTestPumpkin() {
        // Arrange
        String expected = "Yum, this food is tasty";
        Pilot testPilot = new Pilot();
        Pumpkin testPumpkin = new Pumpkin();
        // Act
        String returned = testPilot.eat(testPumpkin);
        // Assert
        Assert.assertEquals(expected, returned);
    }
}
