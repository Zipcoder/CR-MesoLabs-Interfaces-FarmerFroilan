package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Person.Duster;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/4/18
 */
public class FarmHouseTest {

    private Person rin = new Farmer("Rin", 10);
    private Person toria = new Duster("Toria", 10);
    private FarmHouse house = new FarmHouse();

    @Test
    public void enter() {
        house.enter(rin);
        int expected = 1;
        int actual = house.people.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetPerson() {
        house.enter(rin);
        house.enter(toria);

        Assert.assertEquals(rin, house.getPerson(rin.getName()));
        Assert.assertEquals(toria, house.getPerson(toria.getName()));
    }
}