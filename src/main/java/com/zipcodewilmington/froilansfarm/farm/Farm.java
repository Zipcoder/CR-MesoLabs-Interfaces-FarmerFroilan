package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farm.buildings.Stable;
import com.zipcodewilmington.froilansfarm.farm.buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.buildings.FarmHouse;
import com.zipcodewilmington.froilansfarm.farm.field.Field;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.FarmVehicle;

import java.util.ArrayList;

public class Farm {
    private ArrayList<Stable> stables;
    private ArrayList<ChickenCoop> chickenCoops;
    private Field field;
    private FarmHouse farmHouse;
    private ArrayList<FarmVehicle> operatingVehicles;

    public Farm(){
        this.operatingVehicles = new ArrayList<>(0);

    }

    private void addVehicle(FarmVehicle vehicle){
        this.operatingVehicles.add(vehicle);
    }

    private void removeVehicle(FarmVehicle vehicle){
        this.operatingVehicles.remove(vehicle);
    }

    private ArrayList<FarmVehicle> getVehicles(){
        return this.operatingVehicles;
    }





}
