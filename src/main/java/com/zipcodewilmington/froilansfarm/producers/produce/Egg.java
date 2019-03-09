package com.zipcodewilmington.froilansfarm.producers.produce;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoops;

import java.util.ArrayList;

public class Egg implements Edible {
    private ArrayList<Chicken> chickenCoop1;
    private Chicken rooster;

    public Egg(){

    }


    public Egg(ArrayList<Chicken> chickenCoop1, Chicken rooster){

        this.chickenCoop1 = chickenCoop1;
        this.rooster = rooster;
    }

    public Boolean hasBeenHarvested() {

        return !chickenCoop1.contains(rooster);
    }

    public Boolean hasBeenFertilized() {

        return chickenCoop1.contains(rooster);
    }
}

