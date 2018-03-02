package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Buildings.FarmHouse;
import com.zipcodewilmington.froilansfarm.Buildings.Stable;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Production.EarCorn;
import com.zipcodewilmington.froilansfarm.Production.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Production.Tomato;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm {

    private FarmHouse theFarmHouse = new FarmHouse();
    private ArrayList<Stable> stablesOnFarm = new ArrayList<Stable>();
    private ArrayList<ChickenCoop> chickenCoopsOnFarm = new ArrayList<ChickenCoop>();

    private ArrayList<Edible> edibleStorage = new ArrayList<Edible>();

    public Farm() {

    }

    public FarmHouse getFarmHouse() {
        return this.theFarmHouse;
    }

    public ArrayList<Stable> getStablesOnFarm() {
        return this.stablesOnFarm;
    }

    public ArrayList<ChickenCoop> getChickenCoopsOnFarm() {
        return this.chickenCoopsOnFarm;
    }

    public ArrayList<Edible> getEdibleStorage() {
        return this.edibleStorage;
    }

    public void addToEdibleStorage(Edible object) {
        getEdibleStorage().add(object);
    }


}
