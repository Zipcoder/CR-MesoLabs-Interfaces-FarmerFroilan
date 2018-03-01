package com.zipcodewilmington.froilansfarm.farmTest;

import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.farm.Stable;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {

    Stable testStable = new Stable();

    @Test
    public void getHorsesInStableTest(){
        Horse testHorse = new Horse();
        testStable.getHorsesInStable().add(testHorse);
        Horse expected = testHorse;
        Horse actual = testStable.getHorsesInStable().get(0);
        Assert.assertEquals(actual, expected);
    }
}
