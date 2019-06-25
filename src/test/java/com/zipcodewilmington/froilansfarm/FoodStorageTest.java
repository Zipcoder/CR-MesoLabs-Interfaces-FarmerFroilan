package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Tomatoes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FoodStorageTest {

    @Test
    public void add() {
        FoodStorage foodStorage=new FoodStorage();
        Edible tomatoes=new Tomatoes();
        foodStorage.add(tomatoes);
        Assert.assertTrue(foodStorage.isEmpty());
    }

    @Test
    public void retrieve() {

    }


    @Test
    public void isEmpty() {
    }

    @Test
    public void itemCount() {
    }
}