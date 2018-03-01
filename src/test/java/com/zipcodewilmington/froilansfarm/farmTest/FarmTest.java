package com.zipcodewilmington.froilansfarm.farmTest;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Stable;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class FarmTest {

    Farm testFarm = new Farm();

    @Test
    public void getFarmHouseTest(){
        Farmer testFarmer = new Farmer();
        testFarm.getFarmHouse().getPeopleLivingInFarmHouse().add(testFarmer);
        Farmer expected = testFarmer;
        Farmer actual = (Farmer) testFarm.getFarmHouse().getPeopleLivingInFarmHouse().get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getChickenCoopsTest(){
        ChickenCoop chickenCoopTest = new ChickenCoop();
        Chicken testChicken = new Chicken();
        chickenCoopTest.getChickensInCoop().add(testChicken);
        Chicken expected = testChicken;
        testFarm.getChickenCoops().add(chickenCoopTest);
        Chicken actual = testFarm.getChickenCoops().get(0).getChickensInCoop().get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStablesTest(){
        Stable testStable = new Stable();
        Horse testHorse = new Horse();
        testStable.getHorsesInStable().add(testHorse);
        Horse expected = testHorse;
        testFarm.getStables().add(testStable);
        Horse actual = testFarm.getStables().get(0).getHorsesInStable().get(0);
        Assert.assertEquals(expected, actual);
    }
}
