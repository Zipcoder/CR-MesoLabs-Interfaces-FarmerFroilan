package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals;

import com.zipcodewilmington.froilansfarm.farm.things.Rideable;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Hay;

public class Horse extends Animal implements Rideable {

    private boolean ridden;

    public Horse(String name) {
        super(name);
    }

    public void eat(Hay food) {

    }

    public boolean isBeingRidden(){
        return this.ridden;
    }

    public String makeNoise() {
        return null;
    }
}
