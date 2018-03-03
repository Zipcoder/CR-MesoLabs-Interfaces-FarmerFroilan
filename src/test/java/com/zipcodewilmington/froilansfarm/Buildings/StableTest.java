package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.FarmAnimal.Horse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StableTest {

    Stable stable;
    Horse horse;
    Horse horse2;

    @Before
    public void setup() {
        horse = new Horse();
        horse2 = new Horse();
        stable = new Stable();

    }

    @Test
    public void getHorsesTest() {
        stable.addHorse(horse);
        stable.addHorse(horse2);

        List<Horse> expected = Arrays.asList(horse, horse2);
        List<Horse> actual = stable.getHorses();

        Assert.assertEquals(expected, actual);
    }
}