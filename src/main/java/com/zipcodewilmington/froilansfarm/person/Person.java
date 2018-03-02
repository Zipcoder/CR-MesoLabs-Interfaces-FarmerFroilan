package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.Silo;
import com.zipcodewilmington.froilansfarm.farm.Stable;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

import java.util.ArrayList;

public abstract class Person implements NoiseMaker, Eater{
    private final ArrayList<Edible> foodEaten = new ArrayList<Edible>();
    protected String name;
    protected final ArrayList<Edible> eggHarvest = new ArrayList<Edible>();

    public void startOfDayReset(){
        this.foodEaten.clear();
    }
    public void eat(Edible food) {
        this.foodEaten.add(food);
    }
    public ArrayList<Edible> getFoodEaten() {
        return this.foodEaten;
    }
    public void mount(Rideable rideable) {
        rideable.ride();
    }

    public void dismount(Rideable rideable) {
        rideable.stopRiding();
    }

    public String getName() {
        return this.name;
    }

    public void feedHorses(Stable[] stables, Silo silo) {
        for (Stable stable: stables) {
            for (Horse horse: stable.getHorsesInStable()) {
                horse.eat(silo.removeAnEarCorn());
                horse.eat(silo.removeAnEarCorn());
                horse.eat(silo.removeAnEarCorn());
            }
        }
    }

    public void feedChickens(ChickenCoop[] chickenCoops, Silo silo){
        for (ChickenCoop chickenCoop: chickenCoops) {
            for (Chicken chicken: chickenCoop.getChickensInCoop()) {
                chicken.eat(silo.removeAnEarCorn());
            }
        }
    }

    public void rideHorses(Stable[] stables){
        for (Stable stable: stables) {
            for (Horse horse: stable.getHorsesInStable()) {
                horse.ride();
                horse.stopRiding();
            }
        }
    }

    public void harvestEggs(ChickenCoop[] chickenCoops){
        for (ChickenCoop chickenCoop: chickenCoops) {
            for (Chicken chicken: chickenCoop.getChickensInCoop()) {
                this.eggHarvest.add(chicken.yield());
                chicken.setHasBeenHarvested(true);
            }
        }
    }

    public void depositEggs(Silo silo){
        silo.storeFood(this.eggHarvest);
        this.eggHarvest.clear();
    }

    public ArrayList<Edible> getEggHarvest() {
        return this.eggHarvest;
    }
}
