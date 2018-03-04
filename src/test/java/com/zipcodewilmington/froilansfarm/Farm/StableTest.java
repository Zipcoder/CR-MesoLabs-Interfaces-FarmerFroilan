package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Horse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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


}
