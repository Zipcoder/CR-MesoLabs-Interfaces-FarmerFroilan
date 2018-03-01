package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;

public class Farm {

    private FarmHouse farmHouse = new FarmHouse();
    private ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
    private ArrayList<Stable> stables = new ArrayList<Stable>();

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }
}
