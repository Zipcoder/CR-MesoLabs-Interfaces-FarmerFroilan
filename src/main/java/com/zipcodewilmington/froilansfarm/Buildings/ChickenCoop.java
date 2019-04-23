package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.FarmAnimal.Chicken;

import java.util.ArrayList;

public class ChickenCoop {

    ArrayList<Chicken> chickens = new ArrayList<>();

    public void addChicken(Chicken chicken) {
        chickens.add(chicken);
    }

    public ArrayList<Chicken> getChickens() {
        return this.chickens;
    }
}
