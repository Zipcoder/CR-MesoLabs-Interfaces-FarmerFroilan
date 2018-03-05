package com.zipcodewilmington.froilansfarm.BuildingAndPlaces;

import com.zipcodewilmington.froilansfarm.FoodAndAnimals.Chicken;

import java.util.ArrayList;

public class ChickenCoop{
    private ArrayList<Chicken> chickens = new ArrayList<Chicken>();

    public ChickenCoop(int numberOfChickens){
        for(int i = 0; i < numberOfChickens; i++){
            addChicken(i);
        }
    }

    public void addChicken(int idNumber){
        Chicken chicken = new Chicken(idNumber);
        chickens.add(chicken);
    }

    public void removeChicken(){
        chickens.remove(chickens.get(chickens.size()-1));
    }

    public void clearTheChickenCoop(){
        chickens.clear();
    }
}
