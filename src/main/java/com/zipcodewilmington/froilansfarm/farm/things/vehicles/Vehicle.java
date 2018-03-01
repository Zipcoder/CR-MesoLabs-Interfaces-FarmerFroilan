package com.zipcodewilmington.froilansfarm.farm.things.vehicles;

import com.zipcodewilmington.froilansfarm.farm.things.NoiseMaker;
import com.zipcodewilmington.froilansfarm.farm.things.Rideable;

public abstract class Vehicle implements NoiseMaker,Rideable {

    private boolean ridden;

    private String name;

    public Vehicle(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean isBeingRidden(){
        return this.ridden;
    }

}
