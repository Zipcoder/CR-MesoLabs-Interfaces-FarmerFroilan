package com.zipcodewilmington.froilansfarm.FarmAnimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {

    Horse horse;

    @Before
    public void setup() {
        horse = new Horse();
    }

    @Test
    public void getMountedStatusTest() {
        horse.mount();

        boolean expected = true;
        boolean actual = horse.getMountedStatus();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountTest() {
        horse.dismount();

        boolean expected = false;
        boolean actual = horse.getMountedStatus();

        Assert.assertEquals(expected, actual);
    }

}