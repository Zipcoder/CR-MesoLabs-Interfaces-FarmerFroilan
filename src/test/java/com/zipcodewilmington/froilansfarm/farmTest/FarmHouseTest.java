package com.zipcodewilmington.froilansfarm.farmTest;

import com.zipcodewilmington.froilansfarm.animal.Egg;
import com.zipcodewilmington.froilansfarm.farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Pilot;
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

    @Test
    public void startOfDayResetTest(){
        Farmer testFarmer = new Farmer();
        Pilot testPilot = new Pilot();
        testFarmer.eat(new Egg());
        testPilot.eat(new Egg());
        farmHouseTest.getPeopleLivingInFarmHouse().add(testFarmer);
        farmHouseTest.getPeopleLivingInFarmHouse().add(testPilot);
        farmHouseTest.startOfDayReset();
        int expected = 0;
        int expected2 = 0;
        int actual = farmHouseTest.getPeopleLivingInFarmHouse().get(0).getFoodEaten().size();
        int actual2 = farmHouseTest.getPeopleLivingInFarmHouse().get(1).getFoodEaten().size();
        Assert.assertEquals(actual, expected);
        Assert.assertEquals(actual2, expected2);
    }
}
