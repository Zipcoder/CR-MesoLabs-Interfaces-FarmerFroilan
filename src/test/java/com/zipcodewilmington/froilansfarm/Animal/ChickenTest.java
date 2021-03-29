package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Egg;
import com.zipcodewilmington.froilansfarm.shelter.FoodInventory;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest{



    @Test
    public void fertilizedEggTest(){
        Chicken chick = new Chicken("Chickie");
        chick.fertilizeEgg();
        Assert.assertTrue(chick.isFertilized());
    }

//    @Test
//    public void yieldTest(){
//        Chicken chick = new Chicken("Big Bird");
//
//
//        Egg expected = new Egg();
//        Egg actual = chick.yield();
//
//        Assert.assertEquals(expected , actual);
//    }

    @Test
    public void yieldTest2(){
        Chicken chick = new Chicken("Big Bird");
        chick.fertilizeEgg();

        Egg expected = null;
        Egg actual = chick.yield();

        Assert.assertEquals(expected , actual);
    }

    @Test
    public void chickenNameTest(){
        Chicken chick = new Chicken("Clucky");
        String expected = "Clucky";

        String actual = chick.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void chickenNameTest2(){
        Chicken chick = new Chicken("Clucky");
        String expected = "Cluckster";

        String actual = chick.getName();

        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        Chicken chick = new Chicken("Clucky");
        FoodInventory food = new FoodInventory();
        Corn corn = new Corn();
        food.add(corn);
        food.add(corn);
        chick.eat(corn, food);

        Integer expected = 1;
        Integer actual = food.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void eatTest2(){
        Chicken chick = new Chicken("Clucky");
        FoodInventory food = new FoodInventory();
        Corn corn = new Corn();
        food.add(corn);
        food.add(corn);
        food.add(corn);
        chick.eat(corn, food);

        Integer expected = 2;
        Integer actual = food.size();

        Assert.assertEquals(expected, actual);

    }



    @Test
    public void chickenMakeNoiseTest(){
        Chicken chick = new Chicken("Clucky");
        String expected = "Cock-a-doodle-doo";

        String actual = chick.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void chickenMakeNoiseTest2(){
        Chicken chick = new Chicken("Clucky");
        String expected = "cluck cluck";

        String actual = chick.makeNoise();

        Assert.assertNotEquals(expected, actual);
    }


}