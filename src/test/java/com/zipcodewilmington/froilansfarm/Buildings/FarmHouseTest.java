package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.Person.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FarmHouseTest {

    FarmHouse farmHouse;
    Person joe;
    Person george;

    @Before
    public void setup() {
        farmHouse = new FarmHouse();
        joe = new Person();
        george = new Person();
    }

    @Test
    public void getPeopleTest() {
        farmHouse.addPerson(joe);
        farmHouse.addPerson(george);

        List<Person> expected = Arrays.asList(joe, george);
        List<Person> actual = farmHouse.getPeople();

        Assert.assertEquals(expected, actual);
    }

}