package com.zipcodewilmington.froilansfarm.HousingTest;

import com.zipcodewilmington.froilansfarm.Farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.Farm.Housing;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {
    Person person = new Farmer();

    @Test
    public void houseSizeOne() {
        //Given
        FarmHouse farmHouse = new FarmHouse(3, person);
        int expected = 3;

        //When
        int actual = farmHouse.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void houseSizeTwo() {
        //Given
        FarmHouse farmHouse = new FarmHouse(56, person);
        int expected = 56;

        //When
        int actual = farmHouse.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePersonOne() {
        //Given
        FarmHouse farmHouse = new FarmHouse(4, person);
        int expected = 3;

        //When
        farmHouse.movedOut(person);
        int actual = farmHouse.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inheritance() {
        //Given
        FarmHouse farmHouse = new FarmHouse();

        //Then
        Assert.assertTrue(farmHouse instanceof Housing);
    }
}
