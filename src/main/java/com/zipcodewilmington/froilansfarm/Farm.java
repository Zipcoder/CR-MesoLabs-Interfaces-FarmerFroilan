package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Buildings.FarmHouse;
import com.zipcodewilmington.froilansfarm.Buildings.Stable;
import com.zipcodewilmington.froilansfarm.Production.Field;

import java.util.ArrayList;

public class Farm {

    private FarmHouse theFarmHouse = new FarmHouse();
    private ArrayList<Stable> stablesOnFarm = new ArrayList<Stable>();
    private ArrayList<ChickenCoop> chickenCoopsOnFarm = new ArrayList<ChickenCoop>();
    private Field theField = new Field();


    public Farm() {


    }


    public FarmHouse getFarmHouse() {
        return this.theFarmHouse;
    }

    public ArrayList<Stable> getStablesOnFarm() {
        return this.stablesOnFarm;
    }

    public void addStableToFarm(Stable aStable) {
        this.stablesOnFarm.add(aStable);
    }

    public ArrayList<ChickenCoop> getChickenCoopsOnFarm() {
        return this.chickenCoopsOnFarm;
    }

    public void addChickenCoopToFarm(ChickenCoop aChickenCoop) {
        this.chickenCoopsOnFarm.add(aChickenCoop);
    }

    public Field getField() {
        return this.theField;
    }
}
