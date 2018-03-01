package com.zipcodewilmington.froilansfarm.farmTest;

import com.zipcodewilmington.froilansfarm.farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {
    FarmHouse farmHouseTest = new FarmHouse();

    @Test
    public void getPeopleLivingInFarmHouseTest(){
        Farmer testPerson = new Farmer();
        farmHouseTest.getPeopleLivingInFarmHouse().add(testPerson);
        Farmer expected = testPerson;
        Farmer actual = (Farmer) farmHouseTest.getPeopleLivingInFarmHouse().get(0);
        Assert.assertEquals(expected, actual);
    }
}
