package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.shelter.FoodInventory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {

    @Test
    public void horseNameTest(){
        Horse horse = new Horse("Secretariat");
        String expected = "Secretariat";

        String actual = horse.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void horseNameTest2(){
        Horse horse = new Horse("Secretariat");
        String expected = "horse";

        String actual = horse.getName();

        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void horseEatTest(){
        Horse horse = new Horse("Secretariat");
        FoodInventory food = new FoodInventory();
        Corn corn = new Corn();
        food.add(corn);
        food.add(corn);
        horse.eat(corn, food);

        Integer expected = 1;
        Integer actual = food.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void horseEatTest2(){
        Horse horse = new Horse("Secretariat");
        FoodInventory food = new FoodInventory();
        Corn corn = new Corn();
        food.add(corn);
        food.add(corn);
        food.add(corn);
        horse.eat(corn, food);

        Integer expected = 1;
        Integer actual = food.size();

        Assert.assertNotEquals(expected, actual);
    }


    @Test
    public void horseMakeNoise(){
        Horse horse = new Horse("Secretariat");
        String expected = "Nayyy";

        String actual = horse.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void horseMakeNoise2(){
        Horse horse = new Horse("Secretariat");
        String expected = "Naaaayyy";

        String actual = horse.makeNoise();

        Assert.assertNotEquals(expected, actual);
    }

}