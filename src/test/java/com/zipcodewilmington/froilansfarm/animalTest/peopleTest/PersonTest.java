package com.zipcodewilmington.froilansfarm.animalTest.peopleTest;

import com.zipcodewilmington.froilansfarm.animals.people.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testGetSetName(){
        // Given
        Person person = new Person();
        String expected = "Froilan";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testEat(){

    }
}
