package com.zipcodewilmington.froilansfarm.AnimalStorage;


import com.zipcodewilmington.froilansfarm.Horse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.After;
import org.junit.Before;


import static org.junit.Assert.*;

public class StableTest {


            Stable stable = new Stable();


    @Test
    public void addHorseTest() {
        Horse horse = new Horse();
        stable.add(horse);

        Horse expected = horse;
        Horse actual = stable.get(0);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getHorseTest() {
        Horse horse = new Horse();
        stable.add(new Horse());
        stable.add(new Horse());
        stable.add(horse);

        Horse expected = horse;
        Horse actual = stable.get(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeHorseTest() {
        Horse horse = new Horse();
        stable.add(new Horse());
        stable.add(new Horse());
        stable.add(horse);

        Integer expected = 1;
        Integer actual = stable.animalCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void horseCountTest() {
        Horse horse = new Horse();
        stable.add(new Horse());
        stable.add(new Horse());
        stable.animalCount();

        Integer expected = 2;
        Integer actual = stable.animalCount();

        Assert.assertEquals(expected, actual);


    }

}
