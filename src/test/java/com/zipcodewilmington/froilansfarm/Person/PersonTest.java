package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animal.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Field.EarCorn;
import com.zipcodewilmington.froilansfarm.Field.Tomato;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void GetNameTest(){
        //Given
        Person personTest = new Farmer();

        personTest.setName("Froilan");

        //When
        String expected = "Froilan";
        String actual = personTest.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetPersonBellyTest(){
        //Given
        Person personTest = new Farmer();

        personTest.eat(new EdibleEgg());
        personTest.eat(new EarCorn());
        personTest.eat(new Tomato());

        //When
        int expected = 3;
        int actual = personTest.getPersonsBelly().size();

        //Then
        Assert.assertEquals(expected, actual);
    }

}