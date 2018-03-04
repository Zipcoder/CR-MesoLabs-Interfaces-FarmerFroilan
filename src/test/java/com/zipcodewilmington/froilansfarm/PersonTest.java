package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    public class ChildPerson extends Person{
        public ChildPerson(String name){
            super(name);
        }

        public String makeNoise(){
            return null;
        }

        public void eat(Edible edible) {}
    }

    ChildPerson person;

    @Before
    public void setup(){
        person = new ChildPerson("bill");
    }

    @Test
    public void setNameTest(){
        String expected = "name";
        person.setName(expected);
        Assert.assertEquals(expected, "name");
    }

    @Test
    public void getNameTest(){
        String actual = person.getName();
        Assert.assertEquals("bill", actual);
    }
}
