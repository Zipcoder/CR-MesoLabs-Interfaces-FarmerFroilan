package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Eggs;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void inheritanceTest() {
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Animals);
    }

    @Test
    public void layEggsTest(){
        Chicken chicken = new Chicken();
        Eggs egg = chicken.layEgg();
        Assert.assertTrue(egg instanceof Edibles);
    }
}