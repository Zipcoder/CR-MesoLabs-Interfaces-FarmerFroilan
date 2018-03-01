package com.zipcodewilmington.froilansfarm.farm.buildings;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Chicken;

import java.util.ArrayList;

public class ChickenCoop {
    private ArrayList<Chicken> chickens;

    public ChickenCoop(Chicken ... chickensToAdd){
        this.chickens = new ArrayList<>(0);
        for (Chicken c : chickensToAdd){
            this.chickens.add(c);
        }
    }

    public void addChicken(Chicken chickenToAdd){
        this.chickens.add(chickenToAdd);

    }

    public void removeChicken(Chicken chickenToRemove){
        this.chickens.remove(chickenToRemove);


    }

    public Chicken getChicken(Chicken chickenToGet){

        return this.chickens.get(this.chickens.indexOf(chickenToGet));
    }

    public Chicken getChicken(int chickenIndex){
        return this.chickens.get(chickenIndex);
    }

    public Chicken getChicken(String name){
        for(Chicken c : this.chickens){
            if (c.getName().equals(name)) return c;
        }
        return null;
    }

    public int getChickenCoopSize(){
        return this.chickens.size();
    }



}
