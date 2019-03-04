package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class ChickenCoop {
    private ArrayList<Chicken> chickens = new ArrayList<Chicken>();

    public void addChicken(Chicken chicken){
        chickens.add(chicken);
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }
}
