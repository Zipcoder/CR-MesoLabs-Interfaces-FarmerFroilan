package com.zipcodewilmington.froilansfarm.personTest;

import com.zipcodewilmington.froilansfarm.animal.Egg;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.CropRow;
import com.zipcodewilmington.froilansfarm.crop.EarCorn;
import com.zipcodewilmington.froilansfarm.crop.Tomato;
import com.zipcodewilmington.froilansfarm.farm.Farm;
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

    @Test
    public void eatBreakfastTest(){
        Farm farm = new Farm();
        for(int i = 0; i <8; i++){
            farm.getFoodSilo().getEarCornStorage().add(new EarCorn());
            farm.getFoodSilo().getEggStorage().add(new Egg());
            farm.getFoodSilo().getTomatoStorage().add(new Tomato());
        }
        pilotTest.eatBreakfast(farm.getFoodSilo());
        int expected = 5;
        int actual = pilotTest.getFoodEaten().size();
        Assert.assertEquals(expected, actual);
    }
}
