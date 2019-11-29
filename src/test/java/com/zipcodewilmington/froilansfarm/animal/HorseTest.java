package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.miscinterfaces.Rider;
import com.zipcodewilmington.froilansfarm.food.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HorseTest {
    Horse horse;
    Rider rider;
    Edible food;

    @Before
    public void setUp() throws Exception {
        this.horse = new Horse();
    }

    @Test
    public void makeNoiseTest(){
        String expected = "Neighhh!";
        String actual = horse.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mountTest(){
        horse.mount(rider);

        Rider actual = rider;
        Rider expected = horse.getRider();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void gallopTest(){
        horse.gallop();

        Boolean expected = true;
        Boolean actual = horse.isMoving();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void dismountTest(){
        horse.mount(rider);
        horse.dismount();

        Rider expected = null;
        Rider actual = horse.getRider();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eatTest(){
        horse.eat(food);

        Integer expected = 1;
        Integer actual = horse.amountOfFoodEaten();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest1(){
        Integer expected = 0;
        Integer actual = horse.amountOfFoodEaten();

        Assert.assertEquals(expected,actual);
    }
}
