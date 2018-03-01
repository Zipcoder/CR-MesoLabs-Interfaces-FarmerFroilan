package com.zipcodewilmington.froilansfarm.personTest;

import com.zipcodewilmington.froilansfarm.animal.Egg;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.CropRow;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
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

    @Test
    public void mountTest(){
        Tractor textTractor = new Tractor();
        farmerTest.mount(textTractor);
        boolean actual = textTractor.getHasRider();
        Assert.assertTrue(actual);
    }

    @Test
    public void plantTest(){
        CropRow testCropRow = new CropRow();
        CornStalk testCornStalk = new CornStalk();
        farmerTest.plant(testCropRow, testCornStalk);
        CornStalk expected = testCornStalk;
        CornStalk actual = (CornStalk) testCropRow.getCropsInRow().get(4);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void eatTest(){
        Egg testEgg = new Egg();
        farmerTest.eat(testEgg);
        int expected = 1;
        int actual = farmerTest.getFoodEaten().size();
        Assert.assertEquals(expected, actual);
    }

}
