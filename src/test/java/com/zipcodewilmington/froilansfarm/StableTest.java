package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StableTest {

    @Test
    public void stableTest() {
        Stable stable = new Stable();

        stable.addHorse(new Horse());

        int numberOfHorses = stable.getHorses();

        Assert.assertEquals(numberOfHorses, 1);
    }

}