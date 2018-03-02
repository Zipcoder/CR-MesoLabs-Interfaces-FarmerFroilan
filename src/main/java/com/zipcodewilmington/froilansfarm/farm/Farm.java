package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crop.Field;

public class Farm {

    private FarmHouse farmHouse = new FarmHouse();
    private ChickenCoop[] chickenCoops = new ChickenCoop[4];
    private Stable[] stables = new Stable[3];
    private Field froilansField = new Field();
    private Silo foodSilo = new Silo();

    public Farm(){
        chickenCoops[0] = new ChickenCoop();
        chickenCoops[1] = new ChickenCoop();
        chickenCoops[2] = new ChickenCoop();
        chickenCoops[3] = new ChickenCoop();
        stables[0] = new Stable();
        stables[1] = new Stable();
        stables[2] = new Stable();
        for (int i = 0; i < 4; i++){
            chickenCoops[0].getChickensInCoop().add(new Chicken());
            chickenCoops[1].getChickensInCoop().add(new Chicken());
            chickenCoops[2].getChickensInCoop().add(new Chicken());
        }
        for (int i = 0; i < 3; i++){
            chickenCoops[3].getChickensInCoop().add(new Chicken());
        }
        for (int i = 0; i < 4; i++){
            stables[0].getHorsesInStable().add(new Horse());
        }
        for (int i = 0; i < 3; i++){
            stables[1].getHorsesInStable().add(new Horse());
            stables[2].getHorsesInStable().add(new Horse());
        }

    }

    public ChickenCoop[] getChickenCoops() {
        return chickenCoops;
    }

    public Stable[] getStables() {
        return stables;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public Field getFroilansField() {
        return froilansField;
    }

    public Silo getFoodSilo() {
        return foodSilo;
    }
}
