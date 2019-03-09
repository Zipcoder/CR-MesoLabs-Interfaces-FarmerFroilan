package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.factories.ChickenFactory;
import com.zipcodewilmington.froilansfarm.producers.produce.Egg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChickenCoops implements  Storage<Chicken> {
    private Chicken[] chickensInCoop;
    private volatile ArrayList<Chicken> chickenCoop = new ArrayList<Chicken>(Arrays.asList(chickensInCoop));
    private Chicken rooster = new Chicken();
    private Egg egg;



    public void add(Chicken chicken) { chickenCoop.add(chicken); }

    public void remove(Chicken chicken){ chickenCoop.remove(chicken); }

    public Integer getCount() { return chickenCoop.size(); }


    public void clear() { chickenCoop.clear(); }

    public boolean contains() {
        if (chickenCoop.contains(rooster)){
            egg.hasBeenFertilized();
        } else
            egg.hasBeenHarvested();

        return false;
    }

    public void gatherEggs() {


    }
}




