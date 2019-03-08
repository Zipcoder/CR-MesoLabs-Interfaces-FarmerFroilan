package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Farmer;
import com.zipcodewilmington.froilansfarm.Horse;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTest {
    Farm farm = Farm.getINSTANCE();

    @Test
    public void singletonConstructorTest(){
        ArrayList<ChickenCoop> actual = farm.getChickenCoops();
        Assert.assertNotNull(actual);
    }

    @Test
    public void stableControlTest(){
        Horse horse = new Horse();
        Stable stable = new Stable();
        farm.getStables().add(stable);
        farm.getStables().get(0).addHorse(horse);
        Assert.assertEquals(farm.getStables().get(0).getHorses().get(0), horse);
    }

    @Test
    public void fieldControlTest(){
        Field field = farm.getField();
        TomatoPlant tomatoPlant = new TomatoPlant();
        field.plantCrop(tomatoPlant);
        Assert.assertEquals(farm.getField().getRow(0).getCrops(), tomatoPlant);
    }

    @Test
    public void farmHouseControlTest(){
        FarmHouse farmHouse = farm.getFarmHouse();
        Farmer farmer = new Farmer("farmer");
        farmHouse.addPerson(farmer);
        Assert.assertEquals(farmer, farm.getFarmHouse().people.get(0));
    }
}
