package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Buildings.FarmHouse;
import com.zipcodewilmington.froilansfarm.Buildings.Stable;

import java.util.ArrayList;

public class Farm {

    private FarmHouse theFarmHouse = new FarmHouse();
    private ArrayList<Stable> stablesOnFarm = new ArrayList<Stable>();
    private ArrayList<ChickenCoop> chickenCoopsOnFarm = new ArrayList<ChickenCoop>();

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

}
