package com.zipcodewilmington.froilansfarm.shelter;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.edible.Egg;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FoodInventoryTest {

    @Test
    public void testAdd1(){
        FoodInventory silo = new FoodInventory();
        Corn corn1 = new Corn();
        Tomato tomato1 = new Tomato();
        Egg egg1 = new Egg();

        silo.add(corn1);
        silo.add(tomato1);
        silo.add(egg1);

        Edible expected1 = corn1;
        Edible actual1 = silo.get(0);

        Edible expected2 = tomato1;
        Edible actual2 = silo.get(1);

        Edible expected3 = egg1;
        Edible actual3 = silo.get(2);

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
    }

    @Test
    public void testAdd2(){
        List<Edible> edibleList = new ArrayList<Edible>();
        Corn corn1 = new Corn();
        Tomato tomato1 = new Tomato();
        Egg egg1 = new Egg();

        edibleList.add(corn1);
        edibleList.add(tomato1);
        edibleList.add(egg1);

        FoodInventory silo = new FoodInventory(edibleList);

        Edible expected1 = corn1;
        Edible actual1 = silo.get(0);

        Edible expected2 = tomato1;
        Edible actual2 = silo.get(1);

        Edible expected3 = egg1;
        Edible actual3 = silo.get(2);

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
    }

//    @Test
//    public void testAdd3(){
//        FoodInventory silo = new FoodInventory();
//
//        String string1 = "testing";
//
//        silo.add(string1); //GET ERROR AS EXPECTED BECAUSE silo needs an edible object
//
//    }

    @Test
    public void removeTest1(){
        FoodInventory silo = new FoodInventory();
        Corn corn1 = new Corn();
        Tomato tomato1 = new Tomato();
        Egg egg1 = new Egg();

        silo.add(corn1);
        silo.add(tomato1);
        silo.add(egg1);

        silo.remove(tomato1);

        Edible expected1 = corn1;
        Edible actual1 = silo.get(0);

        Edible expected2 = egg1;
        Edible actual2 = silo.get(1);

        int expected3 = 2;
        int actual3 = silo.size();

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);


    }

}