package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;

import com.zipcodewilmington.froilansfarm.dailyactivitesexecution.DayInterface;
import com.zipcodewilmington.froilansfarm.dailyactivitesexecution.Weekdays;
import com.zipcodewilmington.froilansfarm.factories.AnimalFactory;
import com.zipcodewilmington.froilansfarm.factories.StorageFactory;
import com.zipcodewilmington.froilansfarm.factories.VehicleFactory;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoops;
import com.zipcodewilmington.froilansfarm.storage.Farmhouse;
import com.zipcodewilmington.froilansfarm.storage.Field;
import com.zipcodewilmington.froilansfarm.storage.Stables;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

import java.util.ArrayList;
import java.util.List;

public  class Farm {
    private ArrayList<Stables> stablesBuildings;
    private ArrayList<ChickenCoops> chickenCoopsBuildings;
    private ArrayList<Tractor> tractors;
    private List<Chicken> chickenList;
    private Farmhouse farmhouse;
    private Field field;
    private CropDuster cropDuster;




    public Farm() {
        farmhouse = new Farmhouse();
        field = new Field();
        cropDuster = VehicleFactory.createSingleCropDuster();
        chickenList = AnimalFactory.createChickenList(2);
        tractors = VehicleFactory.createMultiTractor(2);
        stablesBuildings = StorageFactory.createMultiStables(3);
        chickenCoopsBuildings = StorageFactory.createMultiChickenCoops(3);
    }



    public void executeRoutine(Weekdays weekday) {
         DayInterface day = Weekdays.FRIDAY.newDay();
         day.doFarmWork(this);
    }

    public ArrayList<Stables> getStablesBuildings()
    {
        return  this.stablesBuildings;
    }

    public ArrayList<ChickenCoops> getChickenCoops()
    {
        return  this.chickenCoopsBuildings;
    }

    public ArrayList<Tractor> getTractors()
    {
        return this.tractors;
    }

    public Farmhouse getFarmhouse(){
        return this.farmhouse;
    }

    public Field getField(){
        return this.field;
    }

    public CropDuster getCropDuster(){
        return this.cropDuster;
    }


}
