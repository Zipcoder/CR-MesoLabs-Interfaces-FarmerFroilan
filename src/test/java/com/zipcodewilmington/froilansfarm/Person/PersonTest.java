package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Exceptions.StaminaTooLowException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
@SuppressWarnings("all")
public class PersonTest {
    private static final String expectedName = "dummy";
    private static final int expectedStartingStamina = 10;
    private static final int defaultHungerThreshhold = 10;
    private PersonDummy stock;

    @Before
    public void setup() {
        stock = new PersonDummy();
    }

    @Test
    public void testConstruction() {
        Assert.assertEquals(expectedName, stock.getName());
    }

    @Test
    public void testIsHungryStaminaUnderThreshhold() {
        int lowStamina = defaultHungerThreshhold - 1;
        PersonDummy dummy = new PersonDummy(lowStamina);

        Assert.assertTrue(dummy.isHungry());
    }

    @Test
    public void testIsHungryStaminaAboveThreshhold() {
        PersonDummy dummy = new PersonDummy(defaultHungerThreshhold);

        Assert.assertFalse(dummy.isHungry());
    }

    @Test
    public void testAddStamina() {
        int startingStamina = defaultHungerThreshhold;
        int nutrition = 5;
        int expected = startingStamina + nutrition;

        PersonDummy dummy = new PersonDummy(startingStamina);
        dummy.addStamina(nutrition);
        int actual = dummy.getStamina();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testUpdateStaminaStillHungry() {
        int lowStamina = defaultHungerThreshhold - 5;
        PersonDummy dummy = new PersonDummy(lowStamina);

        Assert.assertTrue(dummy.isHungry());
        dummy.addStamina(1);
        Assert.assertTrue(dummy.isHungry());
    }

    @Test
    public void testUpdateStaminaNotHungryAnymore() {
        int moreThanEnough = defaultHungerThreshhold + 10;
        PersonDummy dummy = new PersonDummy(defaultHungerThreshhold - 1);

        Assert.assertTrue(dummy.isHungry());
        dummy.addStamina(moreThanEnough);

        Assert.assertFalse(dummy.isHungry());
    }

    @Test
    public void testUpdateStaminaStillNotHungry() {
        Assert.assertFalse(stock.isHungry());
        stock.addStamina(1);
        Assert.assertFalse(stock.isHungry());
    }

    @Test
    public void testCanExertStaminaNo() {
        int highExertion = Integer.MAX_VALUE;
        Assert.assertFalse(stock.canExertStamina(highExertion));
    }

    @Test
    public void testCanExertStaminaYes() {
        int lowExertion = 0;
        Assert.assertTrue(stock.canExertStamina(lowExertion));
    }

    @Test
    public void testExertSuccess() {
        int staminaToExert = 2;
        int expected = stock.getStamina() - staminaToExert;
        try {
            stock.exert(staminaToExert);
        } catch (StaminaTooLowException stle) {
            Assert.fail();
        }
        int actual = stock.getStamina();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testExertFail() {
        int staminaToExert = 20;
        int expected = stock.getStamina();
        try {
            stock.exert(staminaToExert);
            Assert.fail();
        } catch (StaminaTooLowException stle) {
            stle.printStackTrace();
        }
        int actual = stock.getStamina();
        Assert.assertEquals(expected, actual);
    }

    private class PersonDummy extends Person {
        private PersonDummy() {
            this(expectedName, expectedStartingStamina);
        }

        private PersonDummy(int startingStamina) {
            this(expectedName, startingStamina);
        }

        private PersonDummy(String name, int startingStamina) {
            super(name, startingStamina);
        }
    }
}