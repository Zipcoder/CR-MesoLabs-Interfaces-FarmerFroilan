package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.producers.produce.Egg;

import java.util.ArrayList;

public class ChickenCoops implements  Storage<Chicken> {
    public Integer getNumberOfChickens;
    private ArrayList<Chicken> chickenCoop;
    private Chicken chicken;
    private Egg egg;



    public void add(Chicken chicken) { chickenCoop.add(chicken); }

    public void remove(Chicken chicken){
        if (chicken.isEdible(true)){
            chickenCoop.remove(chicken);}
        }

    public Integer getCount() { return chickenCoop.size(); }


    public void clear() {
        chickenCoop.clear();
    }

    public boolean contains() {
        if (chickenCoop.contains(chicken.isNotFemale(chicken) == true)){
            egg.hasBeenFertilized();
        } else
            egg.hasBeenHarvested();
        return false;
    }

}




