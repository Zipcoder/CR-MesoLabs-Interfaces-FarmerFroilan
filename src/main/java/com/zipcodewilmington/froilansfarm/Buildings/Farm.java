package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.FarmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.FarmAnimal.Horse;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.ArrayList;

public class Farm {

    public Farm() {

        Person froilan = new Farmer();
        Person froilanda = new Pilot();

        Field field = new Field();

        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        ChickenCoop chickenCoop3 = new ChickenCoop();
        ChickenCoop chickenCoop4 = new ChickenCoop();

        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        FarmVehicle tractor = new Tractor();
        FarmVehicle tractor2 = new Tractor();

        Aircraft cropDuster = new CropDuster();

        CropRow rowOfCornStalk = new CropRow();
        CropRow rowOfCornStalk2 = new CropRow();
        CropRow rowOfCornStalk3 = new CropRow();
        CropRow rowOfTomatoPlants = new CropRow();
        CropRow rowOfBananaTrees = new CropRow();

        field.addRowsOfCrops(rowOfCornStalk);
        field.addRowsOfCrops(rowOfCornStalk2);
        field.addRowsOfCrops(rowOfCornStalk3);
        field.addRowsOfCrops(rowOfTomatoPlants);
        field.addRowsOfCrops(rowOfBananaTrees);

        chickenCoop1.addChicken(new Chicken());
        chickenCoop1.addChicken(new Chicken());
        chickenCoop1.addChicken(new Chicken());
        chickenCoop1.addChicken(new Chicken());
        chickenCoop1.addChicken(new Chicken());

        chickenCoop2.addChicken(new Chicken());
        chickenCoop2.addChicken(new Chicken());
        chickenCoop2.addChicken(new Chicken());

        chickenCoop3.addChicken(new Chicken());
        chickenCoop3.addChicken(new Chicken());
        chickenCoop3.addChicken(new Chicken());

        chickenCoop4.addChicken(new Chicken());
        chickenCoop4.addChicken(new Chicken());
        chickenCoop4.addChicken(new Chicken());
        chickenCoop4.addChicken(new Chicken());

        stable1.addHorse(new Horse());
        stable1.addHorse(new Horse());
        stable1.addHorse(new Horse());

        stable2.addHorse(new Horse());
        stable2.addHorse(new Horse());
        stable2.addHorse(new Horse());

        stable3.addHorse(new Horse());
        stable3.addHorse(new Horse());
        stable3.addHorse(new Horse());
        stable3.addHorse(new Horse());

    }
}
