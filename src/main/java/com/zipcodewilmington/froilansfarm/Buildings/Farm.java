package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;

import java.util.ArrayList;

public class Farm {

    public Farm() {

        Person froilan = new Farmer();
        Field field = new Field();

        CropRow rowOfCornStalk = new CropRow();
        CropRow rowOfCornStalk2 = new CropRow();
        CropRow rowOfCornStalk3 = new CropRow();
        CropRow rowOfTomatoPlants = new CropRow();
        CropRow rowOfBananaTrees = new CropRow();

        //field.addRowsOfCrops();
    }

    ArrayList<Stable> stables = new ArrayList<>();
    ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();
    FarmHouse farmHouse = new FarmHouse();

}
