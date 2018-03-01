package com.zipcodewilmington.froilansfarm.animalTest;

import com.zipcodewilmington.froilansfarm.animal.Egg;
import org.junit.Assert;
import org.junit.Test;

public class EggTest {

    @Test
    public void getEdibleTest(){
        Egg testEgg = new Egg();
        boolean expected = testEgg.getIsEdible();
        Assert.assertTrue(expected);
    }
}
