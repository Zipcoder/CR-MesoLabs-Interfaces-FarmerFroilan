package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.Plants.Field;
import java.util.ArrayList;

public class Farm {

    private ArrayList<Stable> horseStables = new ArrayList<Stable>(); // can have many of these
    private ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>(); // can have many of these
    private FarmHouse froilansHouse = new FarmHouse();
    private Field field;

    public Farm(int amountOfChickenCoops, int amountOfHorseStables, int amountOfRowsInField) {
        for (int i = 0; i < amountOfChickenCoops; i++) {
            chickenCoops.add(new ChickenCoop());
        }
        for (int i = 0; i < amountOfHorseStables; i++) {
            horseStables.add(new Stable());
        }
        this.field = new Field(amountOfRowsInField);
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public ArrayList<Stable> getHorseStables() {
        return horseStables;
    }

    public FarmHouse getFarmHouse() {
        return froilansHouse;
    }

    public Field getField() {
        return field;
    }

}
