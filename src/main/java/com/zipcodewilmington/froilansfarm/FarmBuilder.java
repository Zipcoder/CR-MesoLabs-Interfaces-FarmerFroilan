package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Crops;
import com.zipcodewilmington.froilansfarm.Shelter.*;

public class FarmBuilder {
    private Barn barn;
    private Stable stable;
    private Garage garage;
    private FarmHouse farmHouse;
    private ChickenCoop chickenCoop;
    private CropRow field;
    private Market market;
    private FoodStorage silo;
    private Crops crops;
    private Chicken chicken;
    private Horse horse;
    private FoodStorage refrigerator;

    public void setRefrigerator(FoodStorage refrigerator) {
        this.refrigerator = refrigerator;
    }

    public FarmBuilder setChicken(Chicken chicken) {
        this.chicken = chicken;
        return this;
    }

    public FarmBuilder setHorse(Horse horse) {
        this.horse = horse;
        return this;
    }

    public FarmBuilder setBarn(Barn barn) {
        this.barn = barn;
        return this;
    }

    public FarmBuilder setStable(Stable stable) {
        this.stable = stable;
        return this;
    }

    public FarmBuilder setGarage(Garage garage) {
        this.garage = garage;
        return this;
    }

    public FarmBuilder setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
        return this;
    }

    public FarmBuilder setChickenCoop(ChickenCoop chickenCoop) {
        this.chickenCoop = chickenCoop;
        return this;
    }

    public FarmBuilder setField(CropRow field) {
        this.field = field;
        return this;
    }

    public FarmBuilder setMarket(Market market) {
        this.market = market;
        return this;
    }

    public FarmBuilder setSilo(FoodStorage silo) {
        this.silo = silo;
        return this;
    }

    public FarmBuilder setCrops(Crops crops) {
        this.crops = crops;
        return this;
    }
}
