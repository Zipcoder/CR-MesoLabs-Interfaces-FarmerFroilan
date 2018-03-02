package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Edibles.Watermelon;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HorseTest {

    Horse horseTest;

    @Before
    public void setUp(){
        horseTest = new Horse();
    }

    @Test
    public void testImplementation(){
        Assert.assertTrue(horseTest instanceof Animal);
    }
    @Test
    public void testImplementationRide(){
        Assert.assertTrue(horseTest instanceof Rideable);
    }
    @Test
    public void testNoise(){
        String expected = "Neighh";
        String actual = horseTest.makeNoise();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testEat(){
        horseTest.eat(new Watermelon());
        horseTest.eat(new Tomato());
        int actual = horseTest.getFoodFed().size();
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMount(){
        horseTest.canRide();
        boolean expected = true;
        boolean actual = horseTest.isRiding();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testStopRiding(){
        horseTest.canRide();
        horseTest.stopRiding();
        boolean expected = false;
        boolean actual = horseTest.isRiding();
        Assert.assertEquals(expected, actual);
    }

}
