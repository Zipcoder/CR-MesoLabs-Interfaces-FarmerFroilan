package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.person.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    Farmer farmerTest = new Farmer();

    @Test
    public void makeNoiseTest(){
        String expected = "I am making noise!";
        String actual = farmerTest.makeNoise();
        Assert.assertEquals(expected, actual);
    }

}
