package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.factories.ChickenFactory;
import com.zipcodewilmington.froilansfarm.producers.produce.Egg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChickenCoops implements  Storage<Chicken> {
    List<Chicken> chickenList = new ArrayList<Chicken>();
    private Chicken rooster = new Chicken();
    private Egg egg;

    public ChickenCoops(List<Chicken> chickenCoop){
        this.chickenList = chickenCoop;

    }
    public void add(Chicken chicken) { this.chickenList.add(chicken); }

    public void remove(Chicken chicken){ chickenList.remove(chicken); }

    public Integer getCount() { return chickenList.size(); }


    public void clear() { chickenList.clear(); }

    public void gatherEggs() {


    }
}




