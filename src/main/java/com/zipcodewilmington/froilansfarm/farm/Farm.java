package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farm.buildings.Stable;
import com.zipcodewilmington.froilansfarm.farm.buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.buildings.FarmHouse;
import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.field.Field;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Chicken;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Horse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.Pilot;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.CropFactory;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.CropType;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EdibleFactory;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EdibleType;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.FarmVehicle;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.Tractor;

import java.util.ArrayList;

public class Farm {
    private ArrayList<Stable> stables;
    private ArrayList<ChickenCoop> chickenCoops;
    private Field field;
    private FarmHouse farmHouse;
    private WareHouse wareHouse;
    private ArrayList<FarmVehicle> operatingVehicles;

    private Farmer froilan;
    private Pilot froilanda;

    private Tractor badLenny;
    private CropDuster badLarry;

    private Horse shadowfax;
    private Horse steve;
    private Horse guido;
    private Horse jon;
    private Horse vince;
    private Horse kibret;
    private Horse josh;
    private Horse michelle;
    private Horse joe;
    private Horse americanPharoh;



    public Farm(boolean vehicleTestFlag){
        this.operatingVehicles = new ArrayList<>(0);
    }

    public Farm(){
        this.operatingVehicles = new ArrayList<>(0);
        this.stables = new ArrayList<>(0);
        this.chickenCoops = new ArrayList<>(0);
        this.farmHouse = new FarmHouse();

        this.wareHouse = new WareHouse(populateWareHouse().toArray(new Edible[0]));

        CropRow row1 = new CropRow(populateCropRow(CropType.CORN_STALK, 100));
        CropRow row2 = new CropRow(populateCropRow(CropType.TOMATO_PLANT, 100));
        CropRow row3 = new CropRow(populateCropRow(CropType.ARBITRARY_VEGETATION, 100));
        CropRow row4 = new CropRow();
        CropRow row5 = new CropRow();
        this.field = new Field(row1,row2,row3,row4,row5);

        shadowfax = new Horse("Shadowfax");
        steve = new Horse("Steve");
        guido = new Horse("Guido");
        jon = new Horse("Jon");
        vince = new Horse("Vince");
        kibret = new Horse("Kibret");
        josh = new Horse("Josh");
        michelle = new Horse("Michelle");
        joe = new Horse("Joe");
        americanPharoh = new Horse("American Pharoh");
        Stable friendStable = new Stable(steve,guido,jon,michelle);
        Stable workStable = new Stable(vince,kibret,josh,joe);
        Stable eliteStable = new Stable (shadowfax,americanPharoh);
        stables.add(friendStable);
        stables.add(workStable);
        stables.add(eliteStable);

        badLarry = new CropDuster("Bad Larry");
        badLenny = new Tractor("Bad Lenny");
        badLarry.operate(this);
        badLenny.operate(this);

        ChickenCoop coop1 = new ChickenCoop(new Chicken("Steve"),new Chicken(),new Chicken(), new Chicken(), new Chicken());
        ChickenCoop coop2 = new ChickenCoop(new Chicken(), new Chicken(), new Chicken());
        ChickenCoop coop3 = new ChickenCoop(new Chicken(), new Chicken(), new Chicken());
        ChickenCoop coop4 = new ChickenCoop(new Chicken(), new Chicken(), new Chicken(), new Chicken());
        chickenCoops.add(coop1);
        chickenCoops.add(coop2);
        chickenCoops.add(coop3);
        chickenCoops.add(coop4);

        froilan = new Farmer("Froilan");
        froilanda = new Pilot("Froilanda");
        farmHouse.addPerson(froilan);
        farmHouse.addPerson(froilanda);
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

    public ArrayList<Stable> getStables(){ return this.stables;}

    public ArrayList<ChickenCoop> getChickenCoops(){ return this.chickenCoops;}

    public FarmHouse getFarmHouse(){return this.farmHouse;}

    public Field getField(){return this.field;}

    public WareHouse getWareHouse(){
        return this.wareHouse;
    }

    public static Crop[] populateCropRow (CropType typeOfCrop, int numberOfCrops){
        Crop[] arrayOfCrops = new Crop[numberOfCrops];
        for(int i = 0; i< numberOfCrops; i++){
            arrayOfCrops[i] = CropFactory.createCrop(typeOfCrop);
        }
        return arrayOfCrops;
    }

    public static ArrayList<Edible> populateWareHouse(){
        ArrayList<Edible> storage =new  ArrayList <> (0);
        for(int i = 0; i<100; i++) {
            storage.add(EdibleFactory.createEdible(EdibleType.HAY));
        }
        for(int i = 0; i<50; i++) {
            storage.add(EdibleFactory.createEdible(EdibleType.EGG));
        }
        for(int i = 0; i<200; i++) {
            storage.add(EdibleFactory.createEdible(EdibleType.CHICKENFEED));
        }
        for(int i = 0; i<50; i++) {
            storage.add(EdibleFactory.createEdible(EdibleType.EARCORN));
        }
        for(int i = 0; i<50; i++) {
            storage.add(EdibleFactory.createEdible(EdibleType.TOMATO));
        }
        for(int i = 0; i<50; i++) {
            storage.add(EdibleFactory.createEdible(EdibleType.VEGETABLE));
        }
        return storage;
    }





}
