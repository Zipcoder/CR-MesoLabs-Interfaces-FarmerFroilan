package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.things.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PilotTest {

    Pilot froilanda;
    CropDuster badLarry;


    @Before
    public void setUp(){
        froilanda = new Pilot("Froilanda");
        badLarry = new CropDuster("Bad Larry");
    }

    @Test
    public void makeNoiseTest(){
        //Given
        //Pilot froilanda

        //When
        String expected = "Talk to me Goose";
        String actual = froilanda.makeNoise();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void mountTest(){
        //Given
        //Pilot froilanda

        //When
        froilanda.mount(badLarry);

        //Then
        Assert.assertTrue(badLarry.isBeingRidden());
    }

    @Test
    public void dismountTest(){
        //Given
        //Pilot froilanda

        //When
        froilanda.mount(badLarry);
        froilanda.dismount(badLarry);

        //Then
        Assert.assertFalse(badLarry.isBeingRidden());
    }

    @Test
    public void flyTest(){
        //Given
        //Pilot froilanda

        //When
        froilanda.mount(badLarry);
        froilanda.flyAircraft(badLarry);

        //Then
        Assert.assertTrue(badLarry.isFlying());

    }

    @Test
    public void landTest(){
        //Given
        //Pilot froilanda

        //When
        froilanda.mount(badLarry);
        froilanda.flyAircraft(badLarry);
        froilanda.landAircraft(badLarry);

        //Then
        Assert.assertFalse(badLarry.isFlying());

    }



}
