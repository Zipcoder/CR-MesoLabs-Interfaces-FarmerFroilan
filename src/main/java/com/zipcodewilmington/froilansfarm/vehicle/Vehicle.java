package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {
    protected boolean hasRider = false;

    public void ride() {
        this.hasRider = true;

    }

    public boolean getHasRider(){
        return this.hasRider;
    }
}
