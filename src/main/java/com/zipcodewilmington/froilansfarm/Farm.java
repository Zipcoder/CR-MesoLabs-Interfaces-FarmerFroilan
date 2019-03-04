package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Farm {
    private ArrayList<Stable> stables = new ArrayList<Stable>();
    private ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
    private Farmhouse farmhouse;

    public Farm(ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, Farmhouse farmhouse) {
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmhouse = farmhouse;
    }



}
