package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals;

import com.zipcodewilmington.froilansfarm.farm.things.Rideable;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Hay;

public class Horse extends Animal implements Rideable {

    private boolean ridden;

    public Horse(String name) {
        super(name);
    }

    public void eat(Edible food) {
        if(food instanceof Hay){
            this.hasEaten=true;
            this.energyReserves += food.getEnergyValue();
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
