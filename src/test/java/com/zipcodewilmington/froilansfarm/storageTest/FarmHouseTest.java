package com.zipcodewilmington.froilansfarm.storageTest;

import com.zipcodewilmington.froilansfarm.animals.people.Person;
import com.zipcodewilmington.froilansfarm.storage.Farmhouse;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {

    @Test
    public void testAddPersonToFarmHouse(){
        // Given
        Farmhouse house = new Farmhouse();
        Person expected = new Person();

        // When
        house.add(expected);
        Person actual = house.retrieveAtIndex(0);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountPeopleInFarmHouse(){
        // Given
        Farmhouse house = new Farmhouse();
        Person Person1 = new Person();
        Person Person2 = new Person();
        Integer expected = 2;

        // When
        house.add(Person1);
        house.add(Person2);
        Integer actual = house.getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
