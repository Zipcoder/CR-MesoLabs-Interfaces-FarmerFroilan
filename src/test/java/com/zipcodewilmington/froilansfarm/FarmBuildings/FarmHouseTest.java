package com.zipcodewilmington.froilansfarm.FarmBuildings;

import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmHouseTest {

    FarmHouse testFarmHouse;

    @Before
    public void setUp(){
        testFarmHouse = new FarmHouse();
    }

    @Test
    public void testFarmHouse(){
        Farmer testPerson = new Farmer();
        testFarmHouse.getPeople().add(testPerson);
        int actual = testFarmHouse.getPeople().size();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}
