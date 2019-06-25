package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Animal.Pilot;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public  class Field {

    private List<CropRow> field = new ArrayList<>();


    public Field(){ {
        this.cropRows = cropRows;

    }


    private CropRow cropRow;
    List<CropRow> field = new ArrayList<>();


    public Boolean isEmpty() {

        return field.isEmpty();
    }


    public void add() {
        field.add(cropRow);
    }

    public Integer itemCount() {

        return field.size();
    }

    public void remove() {

        field.remove(cropRow);
    }

}

