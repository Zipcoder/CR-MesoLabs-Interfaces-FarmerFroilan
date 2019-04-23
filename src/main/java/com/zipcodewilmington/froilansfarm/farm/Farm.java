package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Egg;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crop.EarCorn;
import com.zipcodewilmington.froilansfarm.crop.Field;
import com.zipcodewilmington.froilansfarm.crop.Potato;
import com.zipcodewilmington.froilansfarm.crop.Tomato;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

public final class Farm {

    private final FarmHouse farmHouse = new FarmHouse();
    private final ChickenCoop[] chickenCoops = new ChickenCoop[4];
    private final Stable[] stables = new Stable[3];
    private final Field froilansField = new Field();
    private final Silo foodSilo = new Silo();
    private final Tractor froilansTractor = new Tractor();
    private final CropDuster froilandasCropDuster = new CropDuster();

    public Farm(){
        chickenCoops[0] = new ChickenCoop();
        chickenCoops[1] = new ChickenCoop();
        chickenCoops[2] = new ChickenCoop();
        chickenCoops[3] = new ChickenCoop();
        stables[0] = new Stable();
        stables[1] = new Stable();
        stables[2] = new Stable();
        for (int i = 0; i < 4; i++){
            chickenCoops[0].getChickensInCoop().add(new Chicken());
            chickenCoops[1].getChickensInCoop().add(new Chicken());
            chickenCoops[2].getChickensInCoop().add(new Chicken());
        }
        for (int i = 0; i < 3; i++){
            chickenCoops[3].getChickensInCoop().add(new Chicken());
        }
        for (int i = 0; i < 4; i++){
            stables[0].getHorsesInStable().add(new Horse());
        }
        for (int i = 0; i < 3; i++){
            stables[1].getHorsesInStable().add(new Horse());
            stables[2].getHorsesInStable().add(new Horse());
        }
        for (int i = 0; i < 200; i++){
            foodSilo.getEggStorage().add(new Egg());
            foodSilo.getEarCornStorage().add(new EarCorn());
            foodSilo.getPotatoStorage().add(new Potato());
            foodSilo.getTomatoStorage().add(new Tomato());
        }
        farmHouse.getPeopleLivingInFarmHouse().add(new Farmer());
        farmHouse.getPeopleLivingInFarmHouse().add(new Pilot());

    }

    public void startOfDayReset(){
        for (Stable stable: stables) {
            stable.startOfDayReset();
        }
        for (ChickenCoop chickenCoop: chickenCoops) {
            chickenCoop.startOfDayReset();
        }
        farmHouse.startOfDayReset();
    }

    public ChickenCoop[] getChickenCoops() {
        return chickenCoops;
    }

    public Stable[] getStables() {
        return stables;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public Field getFroilansField() {
        return froilansField;
    }

    public Silo getFoodSilo() {
        return foodSilo;
    }

    public CropDuster getFroilandasCropDuster() {
        return froilandasCropDuster;
    }

    public Tractor getFroilansTractor() {
        return froilansTractor;
    }
}
