package com.zipcodewilmington.froilansfarm.BuildingsTest;

import com.zipcodewilmington.froilansfarm.Buildings.FarmHouse;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmHouseTest {
    private FarmHouse testFarmHouse;
    private Person testPerson1;
    private Person testPerson2;

    @Before
    public void setup() {
        testFarmHouse = new FarmHouse();
        testPerson1 = new Farmer();
        testPerson2 = new Farmer();

    }

    @Test
    public void addHorseToStableTest() {
        testFarmHouse.addPersonToHouse(testPerson1);
        testFarmHouse.addPersonToHouse(testPerson2);
        int expected = 2;
        int actual = testFarmHouse.getFarmers().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeHorseFromStableTest() {
        testFarmHouse.addPersonToHouse(testPerson1);
        testFarmHouse.addPersonToHouse(testPerson2);
        testFarmHouse.removePersonFromHouse(testPerson1);
        int expected = 1;
        int actual = testFarmHouse.getFarmers().size();
        Assert.assertEquals(expected, actual);
    }
}
