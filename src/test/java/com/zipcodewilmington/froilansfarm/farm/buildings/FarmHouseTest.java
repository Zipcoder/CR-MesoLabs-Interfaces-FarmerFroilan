package com.zipcodewilmington.froilansfarm.farm.buildings;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.Person;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {

    @Test
    public void addPersonTest(){
        //Given
        FarmHouse test = new FarmHouse();
        Person larry = new Farmer("Larry");

        //When
        test.addPerson(larry);
        Person expected = larry;
        Person actual = test.getPerson(larry);

        //Then
        Assert.assertEquals(expected,actual);


    }

    @Test
    public void removePersonTest(){
        //Given
        Person larry = new Farmer("Larry");
        Person lenny = new Farmer ("Lenny");
        FarmHouse test = new FarmHouse(larry, lenny);

        //When
        test.removePerson(lenny);
        int expected = 1;
        int actual = test.getFarmHouseSize();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getPersonTest(){
        //Given
        Person larry = new Farmer("Larry");
        FarmHouse test = new FarmHouse(larry);

        //When
        Person expected = larry;
        Person actual = test.getPerson(larry);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getPersonByIndexTest(){
        //Given
        FarmHouse test = new FarmHouse(new Farmer("Larry"));

        //When
        String expected = "Larry";
        String actual = test.getPerson(0).getName();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getPersonByNameTest(){
        //Given
        FarmHouse test = new FarmHouse(new Farmer("Larry"));

        //When
        String expected = "Larry";
        String actual = test.getPerson("Larry").getName();

        //Then
        Assert.assertEquals(expected,actual);
    }


}
