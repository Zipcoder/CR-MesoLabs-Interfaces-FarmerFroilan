package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;

public class ChickenCoop extends Housing<Chicken>{
    ArrayList<Chicken> coop = new ArrayList<Chicken>();

    public ChickenCoop() {}

    public ChickenCoop(int numOfChickens, Chicken chicken) {
        for (int i = 0; i < numOfChickens; i++) {
            store(chicken);
        }
    }

    public void killChicken(Chicken dinner) {
        coop.remove(dinner);
    }

    @Override
    public void store(Chicken chicken) {
        coop.add(chicken);
    }

    @Override
    public int size() {
        return coop.size();
    }
}
