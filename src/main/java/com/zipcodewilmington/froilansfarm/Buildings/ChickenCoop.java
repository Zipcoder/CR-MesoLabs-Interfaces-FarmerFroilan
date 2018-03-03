package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;

public class ChickenCoop {

    private ArrayList<Chicken> chickens = new ArrayList<Chicken>();

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void addChicken(Chicken newChicken) {
        chickens.add(newChicken);
    }

}

