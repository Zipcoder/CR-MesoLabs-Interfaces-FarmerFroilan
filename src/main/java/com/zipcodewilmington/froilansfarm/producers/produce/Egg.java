package com.zipcodewilmington.froilansfarm.producers.produce;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoops;

import java.util.ArrayList;

public class Egg implements Edible {
    private ArrayList<Chicken> chickenCoop1;
    private Chicken chicken;
    private Boolean fertilized;
    private Integer collectedEggs;

    public Egg(){

    }

    public Boolean hasBeenHarvested() {
        if (fertilized = true){
           Egg egg = new Egg();
           collectedEggs++;
        }
        return false;
    }

    public Boolean hasBeenFertilized() {

        return chicken.hasBeenFertilized();
    }
}

