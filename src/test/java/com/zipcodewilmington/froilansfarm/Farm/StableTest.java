package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Horse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StableTest {
    Stable stable;

    @Before
    public void setup(){
        stable = new Stable();
    }

    @Test
    public void constructorVarArgsTest(){
        Horse testHorse = new Horse();
        stable = new Stable(new Horse(), testHorse, new Horse());
        Assert.assertEquals(testHorse, stable.getHorses().get(1));
    }

    @Test
    public void removeHorseTest(){
        Horse testHorse = new Horse();
        stable = new Stable(testHorse);
        stable.removeHorse(testHorse);
        Assert.assertFalse(stable.getHorses().contains(testHorse));
    }

    @Test
    public void setHorseTest(){
        ArrayList<Horse> testList = new ArrayList<>();
        Horse testHorse = new Horse();
        testList.add(testHorse);
        stable.setHorses(testList);
        Assert.assertEquals(testList, stable.getHorses());
    }

}
