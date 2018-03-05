package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;

import java.util.ArrayList;

public class ChickenCoop {

    protected final ArrayList<Chicken> chickensInCoop = new ArrayList<Chicken>();

    public void addChicken(){
        chickensInCoop.add(new Chicken());
    }

    public ArrayList<Chicken> getChickensInCoop(){
        return chickensInCoop;
    }

}
