package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HorseTest {

    @Test
    public void testDefaultHasBeenRiddenFalse(){
        //Given
        Horse horse = new Horse();

        //Then
        Assert.assertFalse(horse.getRideStatus());
    }

    @Test
    public void testHorseMakeNoise(){
        //Given
        Horse horse = new Horse();
        String expected = "Neigh";

        //Then
        Assert.assertEquals(expected, horse.makeNoise());
    }

    @Test
    public void testHorseEat(){
        //Given
        Horse horse = new Horse();
        Tomato tomato = new Tomato();
        List fakeStomach = new ArrayList<Edible>();
        fakeStomach.add(tomato);

        //When
        horse.eat(tomato);

        //Then
        Assert.assertEquals(fakeStomach,horse.getStomachContents());
    }
}
