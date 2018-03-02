package com.zipcodewilmington.froilansfarm.personTest;

import com.zipcodewilmington.froilansfarm.animal.Egg;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.CropRow;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    Pilot pilotTest = new Pilot();

    @Test
    public void makeNoiseTest(){
        String expected = "I'm the best pilot ever!";
        String actual = pilotTest.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mountTest(){
        Tractor textTractor = new Tractor();
        pilotTest.mount(textTractor);
        boolean actual = textTractor.getHasRider();
        Assert.assertTrue(actual);
    }



    @Test
    public void eatTest(){
        Egg testEgg = new Egg();
        pilotTest.eat(testEgg);
        int expected = 1;
        int actual = pilotTest.getFoodEaten().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void startOfDayResetTest(){
        pilotTest.eat(new Egg());
        pilotTest.startOfDayReset();
        int expected = 0;
        int actual = pilotTest.getFoodEaten().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        String expected = "Froilanda";
        String actual = pilotTest.getName();
        Assert.assertEquals(expected, actual);
    }
}
