package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Edible.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Edible.Tomato;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmerTest {

    Farmer farmer;
    EdibleEgg edibleEgg;
    Tomato tomato;

    @Before
    public void setup(){
        farmer = new Farmer("Farmer");
        edibleEgg = new EdibleEgg();
        tomato = new Tomato();
    }

    @Test
    public void makeNoiseTest(){
        String actual = farmer.makeNoise();
        String expected = "Howdy";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void eatTest(){
        int expected = farmer.getCalories() + 80;
        farmer.eat(edibleEgg);
        int actual = farmer.getCalories();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatVarArgsTest(){
        int expected = farmer.getCalories() + 120;
        farmer.eat(edibleEgg, tomato);
        int actual = farmer.getCalories();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fertilizeTest(){
        TomatoPlant plant = new TomatoPlant();
        farmer.fertilize(plant);
        Assert.assertTrue(plant.isFertilized);
    }

    @Test
    public void fertilizeFieldTest(){
        Farm farm = Farm.getINSTANCE();
        farmer = new Farmer("farmer", farm);
        Field field = new Field();
        TomatoPlant tomatoPlant = new TomatoPlant();
        CropRow cropRow = new CropRow(tomatoPlant);
        field.getRowsList().add(cropRow);
        farm.getFields().add(field);
        farmer.fertilize();
        Assert.assertTrue(tomatoPlant.isFertilized);
    }

}
