package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Farmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmHouseTest {

    FarmHouse farmHouse;
    Farmer farmer1;

    @Before
    public void setup(){
        farmHouse = new FarmHouse();
        farmer1 = new Farmer("farmer1");
    }

    @Test
    public void constructorVarArgsTest(){
        Farmer farmer2 = new Farmer("farmer2");
        farmHouse = new FarmHouse(farmer1, farmer2);
        Assert.assertEquals(farmer2, farmHouse.people.get(1));
    }

    @Test
    public void addPersonTest(){
        farmHouse.addPerson(farmer1);
        Assert.assertTrue(farmHouse.people.contains(farmer1));
    }

    @Test
    public void removePersonTest(){
        farmHouse = new FarmHouse(farmer1);
        farmHouse.removePerson(farmer1);
        Assert.assertFalse(farmHouse.people.contains(farmer1));
    }
}
