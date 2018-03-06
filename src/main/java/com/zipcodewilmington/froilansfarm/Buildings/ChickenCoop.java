package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;

public class ChickenCoop {

    private ArrayList<Chicken> chickensInCoop;

    public ChickenCoop() {
        this.chickensInCoop = new ArrayList<Chicken>();
    }

    public ArrayList<Chicken> getChickensInCoop() {
        return chickensInCoop;
    }

    public void addChickenToCoop(Chicken aChicken) {
        chickensInCoop.add(aChicken);
    }

    public void removeChickenFromCoop(Chicken aChicken) {
        chickensInCoop.remove(aChicken);
    }

}
