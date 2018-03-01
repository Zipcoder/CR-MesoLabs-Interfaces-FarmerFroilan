package com.zipcodewilmington.froilansfarm.BuildingsAndPlaces;

import com.zipcodewilmington.froilansfarm.FoodAndAnimals.Chicken;

import java.util.ArrayList;

public class ChickenCoop{
    private ArrayList<Chicken> chickens = new ArrayList<Chicken>();

    public void addChicken(String name){
        Chicken chicken = new Chicken(name);
        chickens.add(chicken);
    }

    public void removeChicken(String name){
        Chicken chicken = new Chicken();
        chickens.remove(chicken.searchByName());
    }
}
