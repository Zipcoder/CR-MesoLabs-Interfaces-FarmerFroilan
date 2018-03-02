package com.zipcodewilmington.froilansfarm.farm.things.vehicles;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.Pilot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropDusterTest {

    CropDuster badLarry;
    Pilot froilanda;

    @Before
    public void setUp(){
        badLarry = new CropDuster("Bad Larry");
        froilanda = new Pilot("Froilanda");
    }


    @Test
    public void flyTest(){
        //Given

        //When
        froilanda.mount(badLarry);
        badLarry.fly();

        //Then
        Assert.assertTrue(badLarry.isFlying());
    }

    @Test
    public void flyFailTest(){
        //Given

        //When
        badLarry.fly();

        //Then
        Assert.assertFalse(badLarry.isFlying());
    }

    @Test
    public void landTest(){
        //Given

        //When
        froilanda.mount(badLarry);
        badLarry.fly();
        badLarry.land();

        //Then
        Assert.assertFalse(badLarry.isFlying());
    }

    @Test
    public void operateTest(){

    }


}
