package com.zipcodewilmington.froilansfarm.FarmBuildings;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;

public class ChickenCoop {

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    ArrayList<Chicken> chickens = new ArrayList<Chicken>();

    public void addChickens(Chicken chicken) {
        for (int i = 0; i < 5; i++) {
            chickens.add(chicken);
        }
    }
}
