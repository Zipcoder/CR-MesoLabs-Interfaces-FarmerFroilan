package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Food.Pepper;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public class FarmerTest {
    Farmer farmer;
    Pepper pepper;

    @Before
    public void setup() {
        farmer = new Farmer("anon", 10);
        pepper = new Pepper();
    }

    @Test
    public void testFeed() {
        Chicken chicken = new Chicken();
        farmer.feed(chicken, pepper);
    }

    @Test
    public void testPlant() {

    }

    @Test
    public void testMount() {

    }

    @Test
    public void testDismount() {

    }
}