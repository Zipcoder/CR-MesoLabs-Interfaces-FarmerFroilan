package com.zipcodewilmington.froilansfarm.Animal;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FroilanTest {



    @Test
    public void makNoise() {
        //Given
        Froilan froilan = new Froilan();
        String expected = "I'm Froilan! Welcome to mah farm!";

        //When
        String actual = froilan.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void instanceOf(){
        Froilan froilan = new Froilan();
        Assert.assertTrue(froilan instanceof Farmer);
    }

    @Test
    public void instanceOf2(){
        Froilan froilan = new Froilan();
        Assert.assertTrue(froilan instanceof Person);
    }

    @Test
    public void instanceOf3(){
        Froilan froilan = new Froilan();
        Assert.assertTrue(froilan instanceof Driver);
    }
}