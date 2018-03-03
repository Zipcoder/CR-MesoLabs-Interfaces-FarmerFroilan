package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.buildings.Stable;
import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.things.Rideable;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Chicken;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Horse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EdibleType;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Egg;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.PeopleFood;

import java.util.ArrayList;

public class Farmer extends Person implements Botanist,Rider,AnimalFeeder {
    public Farmer(String name) {
        super(name);
    }

    public void plant(Crop cropToPlant, CropRow plantingLocation) {
        plantingLocation.addCrop(cropToPlant);

    }

    public String makeNoise() {

        return "E I E I O";
    }

    public void mount(Rideable ride) {
        ride.getOn();

    }

    public void dismount(Rideable ride) {
        ride.getOff();

    }


    public void exerciseHorses(Stable stableToExercise) {
        for(Horse h : stableToExercise.getAllHorses()){
            this.mount(h);
            h.goForRide();
            this.dismount(h);
        }
    }

    public Egg harvestEgg (Chicken targetChicken){
        targetChicken.harvest();
        return targetChicken.yield();
    }

    public void collectEggs (ChickenCoop targetCoop, WareHouse wareHouseToDepositWith){
        for (Chicken c : targetCoop.getAllChickens()){
            wareHouseToDepositWith.addEdible(this.harvestEgg(c));
        }
        wareHouseToDepositWith.removeNulls();
    }

    public void feedChickens (ChickenCoop targetCoop, WareHouse wareHouseToFeedFrom){
        for(Chicken c : targetCoop.getAllChickens()){
            c.eat(EdibleType.CHICKENFEED, wareHouseToFeedFrom);
        }
    }

    public void feedHorses (Stable targetStable, WareHouse wareHouseToFeedFrom){
        for(Horse h : targetStable.getAllHorses()){
            h.eat(EdibleType.HAY, wareHouseToFeedFrom);
        }

    }



}
