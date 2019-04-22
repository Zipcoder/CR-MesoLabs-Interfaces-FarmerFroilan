package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals;

import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.ChickenFeed;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.Produce;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EdibleType;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Egg;

public class Chicken extends Animal implements Produce {

    private boolean fertilized;
    private boolean harvested;

    public Chicken(String name){
        super(name);
    }

    public Chicken(){
        super();
    }


    public void eat(EdibleType food, WareHouse storageToEatFrom) {
        if(food == EdibleType.CHICKENFEED){
            Edible meal = storageToEatFrom.getEdibleByType(food);
            this.hasEaten = true;
            this.energyReserves += meal.getEnergyValue();
            storageToEatFrom.removeEdibleByType(food);
        }

    }

    public String makeNoise() {
        return "bucKAW!!!";
    }

    public Egg yield() {
        if(!this.isFertilized() && this.isHarvested()) {
            return new Egg();
        }
        else{
            return null;
        }
    }

    public void fertilize(){
        this.fertilized=true;
    }

    public Boolean isFertilized(){
        return this.fertilized;
    }

    public void harvest(){
        this.harvested=true;
    }

    public Boolean isHarvested(){
        return this.harvested;
    }

}
