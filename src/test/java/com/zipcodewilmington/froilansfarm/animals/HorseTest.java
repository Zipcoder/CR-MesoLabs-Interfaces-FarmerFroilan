package com.zipcodewilmington.froilansfarm.animals;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void inheritanceTest(){
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Animals);
    }

    @Test
    public void implementationTest(){
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Rideable);
    }

}