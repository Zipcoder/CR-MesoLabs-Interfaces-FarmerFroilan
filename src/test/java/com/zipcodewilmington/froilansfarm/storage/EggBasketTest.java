package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.factories.StorageFactory;
import com.zipcodewilmington.froilansfarm.producers.produce.Egg;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EggBasketTest {
    ArrayList<Egg> eggBasket = new ArrayList<Egg>();
    Egg edibleEgg = new Egg();

    @Test
    public void addTest() {
        //Given
        eggBasket.add(edibleEgg);
        Boolean expected = false;
        //When
        Boolean actual = eggBasket.isEmpty();
        //Then
        Assert.assertEquals(expected,actual);

    }

}