package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crop.CropRow;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Silo;
import com.zipcodewilmington.froilansfarm.farm.Stable;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplicationTest {

    MainApplication mainApp = new MainApplication();
    private final Farm farm = mainApp.getFarm();
    private final Farmer froilan = (Farmer) farm.getFarmHouse().getPeopleLivingInFarmHouse().get(0);
    private final Pilot froilanda = (Pilot) farm.getFarmHouse().getPeopleLivingInFarmHouse().get(1);
    private final Silo silo = farm.getFoodSilo();
    private final Stable[] stables = farm.getStables();
    private final ChickenCoop[] chickenCoops = farm.getChickenCoops();
    private final CropRow[] cropRows = farm.getFroilansField().getCropRowsInField();
    private final CropDuster froilandasCropDuster = farm.getFroilandasCropDuster();
    private final Tractor froilansTractor = farm.getFroilansTractor();

    @Test
    public void sundayRoutineTest(){
        mainApp.sundayRoutine();
        int expected = 8;
        int actual = froilan.getFoodEaten().size();
        Assert.assertEquals(expected, actual);
        int expected2 = 5;
        int actual2 = froilanda.getFoodEaten().size();
        Assert.assertEquals(expected2, actual2);
        for (ChickenCoop chickenCoop: chickenCoops) {
            for (Chicken chicken: chickenCoop.getChickensInCoop()) {
                boolean actual3 = chicken.getHasBeenHarvested();
                Assert.assertTrue(actual3);
            }
        }
        for (Stable stable: stables) {
            for (Horse horse: stable.getHorsesInStable()) {
                boolean actual4 = horse.getHasBeenRidden();
                Assert.assertTrue(actual4);
            }
        }
        int expected5 = 100;
        for (int i = 0; i < 3; i++){
            int actual5 = cropRows[i].getCropsInRow().size();
            Assert.assertEquals(expected5, actual5);
        }
        int expected6 = 208;
        int actual6 = silo.getEggStorage().size();
        Assert.assertEquals(expected6, actual6);
        int expected7 = 152;
        int actual7 = silo.getEarCornStorage().size();
        Assert.assertEquals(expected7,actual7);
    }

    @Test
    public void mondayRoutineTest(){
        mainApp.sundayRoutine();
        mainApp.mondayRoutine();
        int expected = 8;
        int actual = froilan.getFoodEaten().size();
        Assert.assertEquals(expected, actual);
        int expected2 = 5;
        int actual2 = froilanda.getFoodEaten().size();
        Assert.assertEquals(expected2, actual2);
        for (ChickenCoop chickenCoop: chickenCoops) {
            for (Chicken chicken: chickenCoop.getChickensInCoop()) {
                boolean actual3 = chicken.getHasBeenHarvested();
                Assert.assertTrue(actual3);
            }
        }
        for (Stable stable: stables) {
            for (Horse horse: stable.getHorsesInStable()) {
                boolean actual4 = horse.getHasBeenRidden();
                Assert.assertTrue(actual4);
            }
        }
        int expected5 = 100;
        for (int i = 0; i < 3; i++){
            int actual5 = cropRows[i].getCropsInRow().size();
            Assert.assertEquals(expected5, actual5);
        }
        for (int i = 0; i < 3; i++){
            boolean actual6 = cropRows[i].getCropsInRow().get(i).getHasBeenFertilized();
            Assert.assertTrue(actual6);
        }
        int expected7 = 216;
        int actual7 = silo.getEggStorage().size();
        Assert.assertEquals(expected7, actual7);
        boolean expected8 = froilandasCropDuster.getHasRider();
        Assert.assertFalse(expected8);
    }

    @Test
    public void tuesdayRoutineTest(){
        mainApp.sundayRoutine();
        mainApp.mondayRoutine();
        mainApp.tuesdayRoutine();
        int expected = 8;
        int actual = froilan.getFoodEaten().size();
        Assert.assertEquals(expected, actual);
        int expected2 = 5;
        int actual2 = froilanda.getFoodEaten().size();
        Assert.assertEquals(expected2, actual2);
        for (ChickenCoop chickenCoop: chickenCoops) {
            for (Chicken chicken: chickenCoop.getChickensInCoop()) {
                boolean actual3 = chicken.getHasBeenHarvested();
                Assert.assertTrue(actual3);
            }
        }
        for (Stable stable: stables) {
            for (Horse horse: stable.getHorsesInStable()) {
                boolean actual4 = horse.getHasBeenRidden();
                Assert.assertTrue(actual4);
            }
        }
        int expected5 = 0;
        for (int i = 0; i < 3; i++){
            int actual5 = cropRows[i].getCropsInRow().size();
            Assert.assertEquals(expected5, actual5);
        }
    }
}
