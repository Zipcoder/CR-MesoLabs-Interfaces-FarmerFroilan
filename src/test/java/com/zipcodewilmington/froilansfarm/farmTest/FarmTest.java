package com.zipcodewilmington.froilansfarm.farmTest;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Egg;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.EarCorn;
import com.zipcodewilmington.froilansfarm.crop.Potato;
import com.zipcodewilmington.froilansfarm.crop.Tomato;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.farm.Stable;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class FarmTest {

    Farm farm = new Farm();

    @Test
    public void getFarmHouseTest(){
        Farmer testFarmer = new Farmer();
        FarmHouse farmHouseTest = new FarmHouse();
        farmHouseTest.getPeopleLivingInFarmHouse().add(testFarmer);
        Farmer expected = testFarmer;
        Farmer actual = (Farmer) farmHouseTest.getPeopleLivingInFarmHouse().get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getChickenCoopsTest(){
        ChickenCoop chickenCoopTest = new ChickenCoop();
        Chicken testChicken = new Chicken();
        chickenCoopTest.getChickensInCoop().add(testChicken);
        Chicken expected = testChicken;
        farm.getChickenCoops()[0] = chickenCoopTest;
        Chicken actual = farm.getChickenCoops()[0].getChickensInCoop().get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStablesTest(){
        Stable testStable = new Stable();
        Horse testHorse = new Horse();
        testStable.getHorsesInStable().add(testHorse);
        Horse expected = testHorse;
        farm.getStables()[0] = testStable;
        Horse actual = farm.getStables()[0].getHorsesInStable().get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFroilansFieldTest(){
        CornStalk testCornStalk = new CornStalk();
        farm.getFroilansField().getCropRowsInField()[0].getCropsInRow().add(testCornStalk);
        CornStalk expected = testCornStalk;
        CornStalk actual = (CornStalk) farm.getFroilansField().getCropRowsInField()[0].getCropsInRow().get(0);
        Assert.assertTrue(actual instanceof CornStalk);
    }

    @Test
    public void SiloConstructorTest(){
        Egg expected = farm.getFoodSilo().removeAnEgg();
        EarCorn expected2 = farm.getFoodSilo().removeAnEarCorn();
        Tomato expected3 = farm.getFoodSilo().removeATomato();
        Potato expected4 = farm.getFoodSilo().removeAPotato();
        Assert.assertTrue(expected instanceof Egg);
        Assert.assertTrue(expected2 instanceof EarCorn);
        Assert.assertTrue(expected3 instanceof Tomato);
        Assert.assertTrue(expected4 instanceof Potato);
    }

    @Test
    public void startOfDayResetTest(){
        farm.getFarmHouse().getPeopleLivingInFarmHouse().get(0).eat(new Egg());
        farm.getChickenCoops()[0].getChickensInCoop().get(0).eat(new EarCorn());
        farm.getStables()[0].getHorsesInStable().get(0).eat(new EarCorn());
        farm.startOfDayReset();
        int expected = 0;
        int expected2 = 0;
        int expected3 = 0;
        int actual = farm.getFarmHouse().getPeopleLivingInFarmHouse().get(0).getFoodEaten().size();
        int actual2 = farm.getChickenCoops()[0].getChickensInCoop().get(0).getFoodEaten().size();
        int actual3 = farm.getStables()[0].getHorsesInStable().get(0).getFoodEaten().size();
        Assert.assertEquals(actual, expected);
        Assert.assertEquals(actual2, expected2);
        Assert.assertEquals(actual3, expected3);
    }

    @Test
    public void getFroilansTractorTest(){
        farm.getFroilansTractor().ride();
        boolean expected = true;
        boolean actual = farm.getFroilansTractor().getHasRider();
        farm.startOfDayReset();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFroilandasCropDusterTest(){
        farm.getFroilandasCropDuster().ride();
        boolean expected = true;
        boolean actual = farm.getFroilandasCropDuster().getHasRider();
        farm.startOfDayReset();
        Assert.assertEquals(expected, actual);
    }
}
