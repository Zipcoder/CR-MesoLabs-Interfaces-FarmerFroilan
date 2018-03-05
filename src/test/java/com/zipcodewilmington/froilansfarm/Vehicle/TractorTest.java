package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Person.Farmer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TractorTest {

    @Test
    public void TractorNoiseTest(){
        //Given
        Tractor tractorTest = new Tractor();

        //When
        String expected = "Rumble";
        String actual = tractorTest.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TractorHasRiderTest(){
        //Given
        Tractor tractorTest = new Tractor();
        Farmer farmerTest = new Farmer();

        tractorTest.riding();

        //When
        boolean expected = true;
        boolean actual = tractorTest.getHasFarmerRiding();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TractorHasNoRiderTest(){
        //Given
        Tractor tractorTest = new Tractor();
        Farmer farmerTest = new Farmer();

        tractorTest.endRiding();

        //When
        boolean expected = false;
        boolean actual = tractorTest.getHasFarmerRiding();

        //Then
        Assert.assertEquals(expected, actual);
    }

}