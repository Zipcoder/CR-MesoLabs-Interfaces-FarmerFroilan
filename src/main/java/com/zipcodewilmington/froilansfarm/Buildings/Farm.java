package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.Crops.*;
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
import java.util.List;

public class Farm {

    private Farmer froilan;
    private Pilot froilanda;

    private Field field;

    private List<ChickenCoop> chickenCoops;
    private List<Stable> stables;

    private FarmVehicle tractor;
    private Aircraft cropDuster;

    private CropRow rowOfCornStalk;
    private CropRow rowOfCornStalk2;
    private CropRow rowOfCornStalk3;
    private CropRow rowOfTomatoPlants;
    private CropRow rowOfBananaTrees;

    private Crop cornStalk;
    private Crop tomatoPlant;
    private Crop bananaTree;

    public Farm() {

        froilan = new Farmer();
        froilanda = new Pilot();

        field = new Field();

        chickenCoops = new ArrayList<>();
            chickenCoops.add(new ChickenCoop());
            chickenCoops.add(new ChickenCoop());
            chickenCoops.add(new ChickenCoop());
            chickenCoops.add(new ChickenCoop());

        stables = new ArrayList<>();
            stables.add(new Stable());
            stables.add(new Stable());
            stables.add(new Stable());

        tractor = new Tractor();
        cropDuster = new CropDuster();

        rowOfCornStalk = new CropRow();
        rowOfCornStalk2 = new CropRow();
        rowOfCornStalk3 = new CropRow();
        rowOfTomatoPlants = new CropRow();
        rowOfBananaTrees = new CropRow();

        cornStalk = new CornStalk();
        tomatoPlant = new TomatoPlant();
        bananaTree = new BananaTree();

        froilan.fillCropRow(rowOfCornStalk, cornStalk);
        froilan.fillCropRow(rowOfCornStalk2, cornStalk);
        froilan.fillCropRow(rowOfCornStalk3, cornStalk);

        froilan.fillCropRow(rowOfTomatoPlants, tomatoPlant);

        froilan.fillCropRow(rowOfBananaTrees, bananaTree);

        field.addRowsOfCrops(rowOfCornStalk);
        field.addRowsOfCrops(rowOfCornStalk2);
        field.addRowsOfCrops(rowOfCornStalk3);

        field.addRowsOfCrops(rowOfTomatoPlants);

        field.addRowsOfCrops(rowOfBananaTrees);

        chickenCoops.get(0).addChicken(new Chicken());
        chickenCoops.get(0).addChicken(new Chicken());
        chickenCoops.get(0).addChicken(new Chicken());
        chickenCoops.get(0).addChicken(new Chicken());
        chickenCoops.get(0).addChicken(new Chicken());

        chickenCoops.get(1).addChicken(new Chicken());
        chickenCoops.get(1).addChicken(new Chicken());
        chickenCoops.get(1).addChicken(new Chicken());

        chickenCoops.get(2).addChicken(new Chicken());
        chickenCoops.get(2).addChicken(new Chicken());
        chickenCoops.get(2).addChicken(new Chicken());

        chickenCoops.get(3).addChicken(new Chicken());
        chickenCoops.get(3).addChicken(new Chicken());
        chickenCoops.get(3).addChicken(new Chicken());
        chickenCoops.get(3).addChicken(new Chicken());

        stables.get(0).addHorse(new Horse());
        stables.get(0).addHorse(new Horse());
        stables.get(0).addHorse(new Horse());

        stables.get(1).addHorse(new Horse());
        stables.get(1).addHorse(new Horse());
        stables.get(1).addHorse(new Horse());

        stables.get(2).addHorse(new Horse());
        stables.get(2).addHorse(new Horse());
        stables.get(2).addHorse(new Horse());
        stables.get(2).addHorse(new Horse());
    }

    public Farmer getFroilan() {
        return froilan;
    }

    public Pilot getFroilanda() {
        return froilanda;
    }

    public Field getField() {
        return field;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public List<Stable> getStables() {
        return stables;
    }

    public FarmVehicle getTractor() {
        return tractor;
    }

    public Aircraft getCropDuster() {
        return cropDuster;
    }

}
