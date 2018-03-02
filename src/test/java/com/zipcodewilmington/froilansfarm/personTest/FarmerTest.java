package com.zipcodewilmington.froilansfarm.personTest;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Egg;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.CropRow;
import com.zipcodewilmington.froilansfarm.crop.EarCorn;
import com.zipcodewilmington.froilansfarm.crop.Tomato;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Silo;
import com.zipcodewilmington.froilansfarm.farm.Stable;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    Farmer farmerTest = new Farmer();

    @Test
    public void makeNoiseTest(){
        String expected = "I am making noise!";
        String actual = farmerTest.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mountTest(){
        Tractor textTractor = new Tractor();
        farmerTest.mount(textTractor);
        boolean actual = textTractor.getHasRider();
        Assert.assertTrue(actual);
    }

    @Test
    public void plantTest(){
        CropRow testCropRow = new CropRow();
        CornStalk testCornStalk = new CornStalk();
        farmerTest.plant(testCropRow, testCornStalk);
        int expected = 80;
        int actual = testCropRow.getCropsInRow().size();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void eatTest(){
        Egg testEgg = new Egg();
        farmerTest.eat(testEgg);
        int expected = 1;
        int actual = farmerTest.getFoodEaten().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestEggsTest(){
        ChickenCoop testChickenCoop = new ChickenCoop();
        for (int i =0 ; i < 15; i++){
            testChickenCoop.getChickensInCoop().add(new Chicken());
        }
        ChickenCoop[] testChickenCoopArray = new ChickenCoop[1];
        testChickenCoopArray[0] = testChickenCoop;
        farmerTest.harvestEggs(testChickenCoopArray);
        int expected = 15;
        int actualy = farmerTest.getEggHarvest().size();
        Assert.assertEquals(expected, actualy);
    }

    @Test
    public void despostEggsTest(){
        Farmer testFarmer = new Farmer();
        ChickenCoop testChickenCoop = new ChickenCoop();
        for (int i =0 ; i < 15; i++){
            testChickenCoop.getChickensInCoop().add(new Chicken());
        }
        ChickenCoop[] testChickenCoopArray = new ChickenCoop[1];
        testChickenCoopArray[0] = testChickenCoop;
        testFarmer.harvestEggs(testChickenCoopArray);
        Silo testSilo = new Silo();
        testFarmer.depositEggs(testSilo);
        int expected = 15;
        int actual = testSilo.getEggStorage().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void startOfDayResetTest(){
        farmerTest.eat(new Egg());
        farmerTest.startOfDayReset();
        int expected = 0;
        int actual = farmerTest.getFoodEaten().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        String expected = "Froilan";
        String actual = farmerTest.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rideHorsesTest(){
        farmerTest.rideHorses(Farm.getInstance().getStables());
        boolean expected = true;
        for (Stable stable: Farm.getInstance().getStables()) {
            for (Horse horse: stable.getHorsesInStable()) {
                boolean actual = horse.getHasBeenRidden();
                Assert.assertEquals(expected, actual);
            }
        }
    }

    @Test
    public void feedHorsesTest(){
        Silo testSilo = new Silo();
        for (int i = 0; i < 40; i++){
            testSilo.getEarCornStorage().add(new EarCorn());
        }
        farmerTest.feedHorses(Farm.getInstance().getStables(), testSilo);
        int expected = 3;
        for (Stable stable: Farm.getInstance().getStables()) {
            for (Horse horse: stable.getHorsesInStable()) {
                int actual = horse.getFoodEaten().size();
                Assert.assertEquals(expected, actual);
            }
        }
    }

    @Test
    public void feedChickensTest(){
        Silo testSilo = new Silo();
        for (int i = 0; i < 40; i++){
            testSilo.getEarCornStorage().add(new EarCorn());
        }
        farmerTest.feedChickens(Farm.getInstance().getChickenCoops(), testSilo);
        int expected = 1;
        for (ChickenCoop  chickenCoop: Farm.getInstance().getChickenCoops()) {
            for (Chicken chicken: chickenCoop.getChickensInCoop()) {
                int actual = chicken.getFoodEaten().size();
                Assert.assertEquals(expected, actual);
            }
        }
    }

    @Test
    public void eatBreakfastTest(){
        for(int i = 0; i <8; i++){
            Farm.getInstance().getFoodSilo().getEarCornStorage().add(new EarCorn());
            Farm.getInstance().getFoodSilo().getEggStorage().add(new Egg());
            Farm.getInstance().getFoodSilo().getTomatoStorage().add(new Tomato());
        }
        farmerTest.eatBreakfast();
        int expected = 8;
        int actual = farmerTest.getFoodEaten().size();
        Assert.assertEquals(expected, actual);
    }
}
