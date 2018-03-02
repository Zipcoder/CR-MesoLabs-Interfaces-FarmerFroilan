package com.zipcodewilmington.froilansfarm.farmTest;

import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crop.EarCorn;
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

    @Test
    public void startOfDayResetTest(){
        Horse testHorse1 = new Horse();
        Horse testHorse2 = new Horse();
        testHorse1.eat(new EarCorn());
        testHorse2.eat(new EarCorn());
        testStable.getHorsesInStable().add(testHorse1);
        testStable.getHorsesInStable().add(testHorse2);
        testStable.startOfDayReset();
        int expected = 0;
        int expected2 = 0;
        int actual = testStable.getHorsesInStable().get(0).getFoodEaten().size();
        int actual2 = testStable.getHorsesInStable().get(1).getFoodEaten().size();
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected2, actual2);
    }
}
