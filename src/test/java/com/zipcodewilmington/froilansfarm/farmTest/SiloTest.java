package com.zipcodewilmington.froilansfarm.farmTest;

import com.zipcodewilmington.froilansfarm.animal.Egg;
import com.zipcodewilmington.froilansfarm.crop.*;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Silo;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SiloTest {

    Silo testSilo = new Silo();

    @Test
    public void storeFoodTest(){
        ArrayList<Edible> testEdibles = new ArrayList<Edible>();
        testEdibles.add(new Egg());
        testEdibles.add(new EarCorn());
        testEdibles.add(new Tomato());
        testEdibles.add(new Potato());
        testEdibles.add(new Egg());

        testSilo.storeFood(testEdibles);
        int expected1 = 1;
        int expected2 = 1;
        int expected3 = 1;
        int expected4 = 2;

        int actual1 = testSilo.getEarCornStorage().size();
        int actual2 = testSilo.getPotatoStorage().size();
        int actual3 = testSilo.getTomatoStorage().size();
        int actual4 = testSilo.getEggStorage().size();

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
    }

    @Test
    public void removeAnEggTest(){
        Farm.getInstance().getFoodSilo().getEggStorage().clear();
        Egg eggTest1 = new Egg();
        Egg eggTest2 = new Egg();
        testSilo.getEggStorage().add(eggTest1);
        testSilo.getEggStorage().add(eggTest2);
        testSilo.removeAnEgg();
        Egg actual1 = testSilo.removeAnEgg();
        Egg expected = eggTest2;
        int expected2 = 0;
        int actual2 = testSilo.getEggStorage().size();
        Assert.assertEquals(expected, actual1);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void removeATomatoTest(){
        Farm.getInstance().getFoodSilo().getTomatoStorage().clear();
        Tomato tomatoTest = new Tomato();
        testSilo.getTomatoStorage().add(tomatoTest);
        Tomato actual = testSilo.removeATomato();
        Tomato expected = tomatoTest;
        int expected2 = 0;
        int actual2 = testSilo.getTomatoStorage().size();
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void removeAPotatoTest(){
        Farm.getInstance().getFoodSilo().getPotatoStorage().clear();
        Potato potatoTest = new Potato();
        testSilo.getPotatoStorage().add(potatoTest);
        Potato actual = testSilo.removeAPotato();
        Potato expected = potatoTest;
        int expected2 = 0;
        int actual2 = testSilo.getPotatoStorage().size();
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void removeAnEarCornTest(){
        Farm.getInstance().getFoodSilo().getEarCornStorage().clear();
        EarCorn earCornTest = new EarCorn();
        testSilo.getEarCornStorage().add(earCornTest);
        EarCorn expected1 = earCornTest;
        EarCorn actual1 = testSilo.removeAnEarCorn();
        int expected2 = 0;
        int actual2 = testSilo.getEarCornStorage().size();
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);

    }

}
