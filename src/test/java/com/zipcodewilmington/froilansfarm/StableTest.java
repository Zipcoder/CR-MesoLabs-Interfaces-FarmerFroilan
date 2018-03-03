package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Buildings.Stable;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {

    @Test
    public void addHorseTest() {
        Stable stable = new Stable();
        stable.addHorse(new Horse());
        stable.addHorse(new Horse());
        stable.addHorse(new Horse());
        Assert.assertEquals(3, stable.getHorses().size());
    }

}
