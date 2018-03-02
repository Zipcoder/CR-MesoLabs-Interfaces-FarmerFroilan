package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Chicken;

import java.util.ArrayList;

public class ChickenCoop {
    protected ArrayList<Chicken> chickens;

    public ChickenCoop(){
        this.chickens = new ArrayList<Chicken>();
    }

    public ChickenCoop(Chicken... chickens){
        this.chickens = new ArrayList<Chicken>();
        for (Chicken chicken:chickens) {
            this.chickens.add(chicken);
        }
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void addChicken(Chicken chicken){
        this.chickens.add(chicken);
    }

    public void removeChicken(Chicken chicken){
        this.chickens.remove(chicken);
    }
}
