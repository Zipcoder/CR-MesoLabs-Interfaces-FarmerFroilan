package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals;

import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.things.Rideable;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EdibleType;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Hay;

public class Horse extends Animal implements Rideable {

    private boolean ridden;

    public Horse(String name) {
        super(name);
    }

    public void eat(EdibleType food, WareHouse storageToEatFrom) {
        if(food == EdibleType.HAY){
            Edible meal = storageToEatFrom.getEdibleByType(food);
            this.hasEaten = true;
            this.energyReserves += meal.getEnergyValue();
            storageToEatFrom.removeEdibleByType(food);
        }
    }


    public void getOn(){
        this.ridden = true;
    }

    public void getOff(){
        this.ridden = false;
    }

    public boolean isBeingRidden(){
        return this.ridden;
    }

    public String makeNoise() {

        return "neeeeEEEEIIIIIIGGGGGGGhhhhhhh!!!";
    }
}
