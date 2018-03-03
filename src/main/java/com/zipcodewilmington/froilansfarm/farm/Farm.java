package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farm.buildings.Stable;
import com.zipcodewilmington.froilansfarm.farm.buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.buildings.FarmHouse;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.field.Field;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.CropFactory;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.CropType;
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

        CropRow row1 = new CropRow();

    }

    public void addVehicle(FarmVehicle vehicle){
        this.operatingVehicles.add(vehicle);
    }

    public void removeVehicle(FarmVehicle vehicle){
        this.operatingVehicles.remove(vehicle);
    }

    public ArrayList<FarmVehicle> getVehicles(){
        return this.operatingVehicles;
    }

    public Crop[] populateCropRow (CropType typeOfCrop, int numberOfCrops){
        Crop[] arrayOfCrops = new Crop[numberOfCrops];
        for(int i = 0; i< numberOfCrops; i++){
            arrayOfCrops[i] = CropFactory.createCrop(typeOfCrop);
        }
        return arrayOfCrops;
    }





}
