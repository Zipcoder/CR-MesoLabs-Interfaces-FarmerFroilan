package com.zipcodewilmington.froilansfarm.farm.things.vehicles;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void getNameTest(){
        //Given
        Vehicle badLarry = new CropDuster("Bad Larry");

        //When
        String expected = "Bad Larry";
        String actual = badLarry.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getOnTest(){
        //Given
        Vehicle badLarry = new CropDuster("Bad Larry");


        //When
        badLarry.getOn();

        //Then
        Assert.assertTrue(badLarry.isBeingRidden());

    }

    @Test
    public void getOffTest(){
        //Given
        Vehicle badLarry = new CropDuster("Bad Larry");


        //When
        badLarry.getOn();
        badLarry.getOff();

        //Then
        Assert.assertFalse(badLarry.isBeingRidden());
    }

}
