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
        Farm.getInstance().getChickenCoops()[0] = chickenCoopTest;
        Chicken actual = Farm.getInstance().getChickenCoops()[0].getChickensInCoop().get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStablesTest(){
        Stable testStable = new Stable();
        Horse testHorse = new Horse();
        testStable.getHorsesInStable().add(testHorse);
        Horse expected = testHorse;
        Farm.getInstance().getStables()[0] = testStable;
        Horse actual = Farm.getInstance().getStables()[0].getHorsesInStable().get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFroilansFieldTest(){
        CornStalk testCornStalk = new CornStalk();
        Farm.getInstance().getFroilansField().getCropRowsInField()[0].getCropsInRow().add(testCornStalk);
        CornStalk expected = testCornStalk;
        CornStalk actual = (CornStalk) Farm.getInstance().getFroilansField().getCropRowsInField()[0].getCropsInRow().get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SiloConstructorTest(){
        Egg expected = Farm.getInstance().getFoodSilo().removeAnEgg();
        EarCorn expected2 = Farm.getInstance().getFoodSilo().removeAnEarCorn();
        Tomato expected3 = Farm.getInstance().getFoodSilo().removeATomato();
        Potato expected4 = Farm.getInstance().getFoodSilo().removeAPotato();
        Assert.assertTrue(expected instanceof Egg);
        Assert.assertTrue(expected2 instanceof EarCorn);
        Assert.assertTrue(expected3 instanceof Tomato);
        Assert.assertTrue(expected4 instanceof Potato);
    }

    @Test
    public void startOfDayResetTest(){
        Farm.getInstance().getFarmHouse().getPeopleLivingInFarmHouse().get(0).eat(new Egg());
        Farm.getInstance().getChickenCoops()[0].getChickensInCoop().get(0).eat(new EarCorn());
        Farm.getInstance().getStables()[0].getHorsesInStable().get(0).eat(new EarCorn());
        Farm.getInstance().startOfDayReset();
        int expected = 0;
        int expected2 = 0;
        int expected3 = 0;
        int actual = Farm.getInstance().getFarmHouse().getPeopleLivingInFarmHouse().get(0).getFoodEaten().size();
        int actual2 = Farm.getInstance().getChickenCoops()[0].getChickensInCoop().get(0).getFoodEaten().size();
        int actual3 = Farm.getInstance().getStables()[0].getHorsesInStable().get(0).getFoodEaten().size();
        Assert.assertEquals(actual, expected);
        Assert.assertEquals(actual2, expected2);
        Assert.assertEquals(actual3, expected3);
    }
}
