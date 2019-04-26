package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Field.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HorseTest {

    @Test
    public void HorseSpeakTest(){
        //Given
        Horse horseTest = new Horse();

        //When
        String expected = "HeHawww!";
        String actual = horseTest.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HorseEatTest(){
        //Given
        Horse horseTest = new Horse();

        horseTest.eat(new EarCorn());
        horseTest.eat(new EarCorn());
        horseTest.eat(new EarCorn());

        //When
        int expected = 3;
        int actual = horseTest.getBelly().size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HorseRidingTest(){
        //Given
        Horse horseTest = new Horse();

        horseTest.riding();

        //When
        boolean expected = true;
        boolean actual = horseTest.checkRiding();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void EndHorseRidingTest(){
        //Given
        Horse horseTest = new Horse();

        horseTest.riding();
        horseTest.endRiding();

        //When
        boolean expected = false;
        boolean actual = horseTest.checkRiding();

        //Then
        Assert.assertEquals(expected, actual);
    }

}