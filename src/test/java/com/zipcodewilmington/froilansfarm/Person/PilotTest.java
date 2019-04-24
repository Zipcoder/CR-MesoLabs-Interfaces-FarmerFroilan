package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PilotTest {

    Pilot testPilot;

    @Before
    public void setUp(){
        testPilot = new Pilot();
    }

    @Test
    public void nameTest(){
       String actual = testPilot.getName();
       String expected = "Froilanda";
       Assert.assertEquals(expected, actual);
    }
    @Test
    public void noiseTest(){
        String expected = "Pilot noises";
        String actual = testPilot.makeNoise();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eatTest(){
        EarCorn testCorn = new EarCorn();
        testPilot.eat(testCorn);
        int actual = testPilot.getFoodFed().size();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void flyTest(){
        CropDuster testDuster = new CropDuster();
        testPilot.flyDuster(testDuster);
        boolean actual = testDuster.getHasRider();
        Assert.assertTrue(actual);
    }
    @Test
    public void landTest(){
        CropDuster testDuster = new CropDuster();
        testPilot.landDuster(testDuster);
        boolean actual = testDuster.getHasRider();
        Assert.assertFalse(actual);
    }
}
