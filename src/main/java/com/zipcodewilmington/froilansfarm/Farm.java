package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Farm {

    public Farm(ArrayList<Field> fields, ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, FarmHouse farmHouse, ArrayList<FarmHouse> peopleInFarmHouse){}

    ArrayList<Field> fields;

    ArrayList<Stable> stables;

    FarmHouse farmHouse;

    ArrayList<ChickenCoop> chickenCoops;

    ArrayList<Person> people;

    public Farm(ArrayList<Field> fields, ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, FarmHouse farmHouse, ArrayList<Person> people){
        this.fields = fields;
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmHouse = farmHouse;
        this.people = people;
    }
}
