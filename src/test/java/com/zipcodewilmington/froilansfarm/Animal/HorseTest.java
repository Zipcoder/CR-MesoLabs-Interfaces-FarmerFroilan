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

    @Before
    public void setup() {
        horse = new Horse();
        rider = new Farmer();
    }

    @Test
    public void getRiderNull() {
        Assert.assertNull(horse.getRider());
    }

    @Test
    public void startRide() {
        Assert.assertNull(horse.getRider());
        horse.startRide(new Farmer());
        Assert.assertNotNull(horse.getRider());
    }

    @Test
    public void stopRide() {
        horse.startRide(rider);

        Assert.assertNotNull(horse.getRider());

        horse.stopRide();

        Assert.assertNull(horse.getRider());
    }

    @Test
    public void wasRiddenTodayNo() {
        Assert.assertFalse(horse.wasRiddenToday());
    }

    @Test
    public void wasRiddenTodayYes() {
        horse.startRide(rider);
        Assert.assertTrue(horse.wasRiddenToday());
    }
}
