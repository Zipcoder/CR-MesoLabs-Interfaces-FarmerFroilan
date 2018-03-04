package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HorseTest {
    Horse horse;
    Farmer farmer;

    @Before
    public void setup(){
        horse = new Horse();
        farmer = new Farmer("farmer");
    }

    @Test
    public void makeNoiseTest(){
        String expected = "Neigh";
        String actual = horse.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        horse.eat(new Tomato());
        Assert.assertEquals(horse.getCalories(), 40);
    }

    @Test
    public void rideTest(){
        horse.setRider(farmer);
        Assert.assertEquals(farmer, horse.getRider());
    }

}
