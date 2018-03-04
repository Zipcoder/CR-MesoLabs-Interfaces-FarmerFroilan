package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Crops.Field;

import java.util.ArrayList;

public class Farm {
    private FarmHouse farmHouse = new FarmHouse();
    private ArrayList<Field> fields = new ArrayList<>();
    private ArrayList<Stable> stables = new ArrayList<>();
    private ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();
    private static final Farm INSTANCE = new Farm();

    private Farm(){}

    public static Farm getINSTANCE() {
        return INSTANCE;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public ArrayList<Field> getFields() {
        return fields;
    }

    public void setFields(ArrayList<Field> fields) {
        this.fields = fields;
    }

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public void setStables(ArrayList<Stable> stables) {
        this.stables = stables;
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ArrayList<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }
}
