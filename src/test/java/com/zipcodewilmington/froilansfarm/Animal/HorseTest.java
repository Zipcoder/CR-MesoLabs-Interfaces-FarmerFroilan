package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Horse;
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

}