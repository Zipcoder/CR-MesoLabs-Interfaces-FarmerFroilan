package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public class HorseTest {
    private Horse horse;
    private Rider rider;
    private int defaultStamina = 10;

    @Before
    public void setup() {
        horse = new Horse();
        rider = new Farmer("anon", defaultStamina);
    }

    @Test
    public void testGetRiderNull() {
        Assert.assertNull(horse.getRider());
    }

    @Test
    public void testStartRide() {
        Assert.assertNull(horse.getRider());
        horse.startRide(rider);
        Assert.assertNotNull(horse.getRider());
    }

    @Test
    public void testStopRide() {
        horse.startRide(rider);

        Assert.assertNotNull(horse.getRider());

        horse.stopRide();

        Assert.assertNull(horse.getRider());
    }

    @Test
    public void testWasRiddenTodayNo() {
        Assert.assertFalse(horse.wasRiddenToday());
    }

    @Test
    public void testWasRiddenTodayYes() {
        horse.startRide(rider);
        Assert.assertTrue(horse.wasRiddenToday());
    }
}
