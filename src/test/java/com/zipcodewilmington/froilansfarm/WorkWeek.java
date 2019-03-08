package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Edible.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Edible.Tomato;
import com.zipcodewilmington.froilansfarm.Farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Stable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class WorkWeek {
    Farm farm = Farm.getINSTANCE();
    Farmer froilan = farm.getFroilan();
    Farmer froilanda = farm.getFroilanda();
    TomatoPlant tomatoPlant;
    ArrayList<Edible> pantry;
    ArrayList<EdibleEgg> eggs;
    ArrayList<ReproductiveEgg> otherEggs;
    Rooster rooster;

    @Before
    public void setup(){
        tomatoPlant = new TomatoPlant();
        pantry = new ArrayList<>();
        eggs = new ArrayList<>();
        otherEggs = new ArrayList<>();
        rooster = new Rooster();
    }

    @Test
    public void week(){
        sunday();
        monday();
        tuesday();
        wednesday();
        thursday();
        friday();
        saturday();
    }

    @Test
    public void breakfast(){
        int expeceted = froilan.getCalories() + 540;
        int expected1 = froilanda.getCalories() + 320;
        froilan.eat(new EarCorn(), new Tomato(), new Tomato(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg());
        froilanda.eat(new EarCorn(), new EarCorn(), new Tomato(), new EdibleEgg(), new EdibleEgg());
        Assert.assertEquals(froilan.calories, expeceted);
        Assert.assertEquals(froilanda.calories, expected1);
    }

    @Test
    public void morning(){
        breakfast();
        for (Stable stable:farm.getStables()) {
            for (Horse horse:stable.getHorses()) {
                froilan.mount(horse);
                horse.ride();
                froilan.dismount();
                horse.makeNoise();
            }
        }
        Assert.assertTrue(farm.getStables().get(0).getHorses().get(0).hasBeenRidden);
    }

    public void sunday(){
        morning();
        farm.getField().plantCrop(tomatoPlant, new CornStalk(), new PotatoPlant());
        Assert.assertEquals(farm.getField().getRow(0).getCrops(), tomatoPlant);
    }

    public void monday(){
        morning();
        froilanda.mount(farm.getCropDuster());
        farm.getCropDuster().fly();
        farm.getCropDuster().makeNoise();
        farm.getCropDuster().fertilize(farm.getField());
        Assert.assertTrue(farm.getField().getRow(0).getCrops().isFertilized);
    }

    public void tuesday(){
        morning();
        froilan.mount(farm.getTractor());
        farm.getTractor().harvest(farm.getField());
        farm.getTractor().makeNoise();
        Assert.assertTrue(farm.getField().getRow(0).getCrops().isHarvested());
    }

    public void wednesday(){
        morning();
        ArrayList<CropRow> rows =  farm.getField().getRowsList();
        for (CropRow cropRow: rows){
            pantry.add(cropRow.getCrops().yield());
        }
        Assert.assertTrue(pantry.size() == 3);
    }

    public void thursday(){
        for (ChickenCoop chickenCoop:farm.getChickenCoops()) {
            for (Chicken chicken:chickenCoop.getChickens()) {
                eggs.add(chicken.yield());
                chicken.makeNoise();
            }
        }
        Assert.assertTrue(eggs.size() == 15);
    }

    public void friday(){
        for (Chicken chicken:farm.getChickenCoops().get(0).getChickens()){
            rooster.fertilize(chicken);
            otherEggs.add(chicken.layReproductiveEgg());
        }
        Assert.assertTrue(otherEggs.size() == 4);
    }

    public void saturday(){
        froilan.makeNoise();
        froilanda.makeNoise();
        ArrayList<CropRow> rows = farm.getField().getRowsList();
        for (CropRow cropRow:rows){
            cropRow.uproot();
        }
        Assert.assertNull(rows.get(0).getCrops());
    }


}
