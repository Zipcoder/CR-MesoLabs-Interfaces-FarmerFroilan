package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Food.StaminaValue;
import com.zipcodewilmington.froilansfarm.StaminaTooLowException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public class PersonTest {
    private Person Rin;

    @Before
    public void setup() {
        Rin = new Farmer("Rin", 10);
    }

    @Test
    public void testConstruction() {
        String expected = "Rin";
        String actual = Rin.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEat() {
        int expected = Rin.getStamina() + StaminaValue.EGG.asInteger();
        Rin.eat(new Egg());
        int actual = Rin.getStamina();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsHungry() {
    }
}