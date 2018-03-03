package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public abstract class Vehicle implements NoiseMaker, Rideable {
    public boolean hasRider;

    public void setHasRider(){
        this.hasRider = true;
    }

    public boolean getHasRider(){
        return this.hasRider;
    }
}
