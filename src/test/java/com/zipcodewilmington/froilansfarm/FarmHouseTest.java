package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.PersonRelated.Farmer;
import com.zipcodewilmington.froilansfarm.PersonRelated.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FarmHouseTest {
    private Farmer farmer;
    private Farmer farmer1;
    private FarmHouse house;
    @Before
    public void setUp() throws Exception {
        farmer = new Farmer();
        farmer1 = new Farmer();
        house = new FarmHouse();
    }

    @Test
    public void add() {
        house.add(farmer1);
        house.add(farmer);

        Integer expected = 2;
        Integer actual = house.size();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void remove() {
        house.add(farmer1);
        house.add(farmer);
        house.remove(farmer);

        Integer expected = 1;
        Integer actual = house.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void size() {
        house.add(farmer1);
        house.add(farmer);
        house.remove(farmer);

        Integer expected = 1;
        Integer actual = house.size();

        Assert.assertEquals(expected,actual);
    }
}