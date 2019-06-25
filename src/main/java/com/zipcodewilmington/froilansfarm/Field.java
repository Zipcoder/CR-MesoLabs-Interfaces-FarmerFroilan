package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Animal.Pilot;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;

import java.util.List;
import java.util.Map;

public  class Field {

    private List<CropRow> cropRows;


    public Field(List<CropRow> cropRows){//, Map<Chicken, ChickenCoop> chickenChickenCoopMap, Map<Horse, Stable> horseStableMap, List<FarmVehicle> farmVehicles, List<Aircraft> aircraft, Pilot pilot) {
        this.cropRows = cropRows;

    }

}
