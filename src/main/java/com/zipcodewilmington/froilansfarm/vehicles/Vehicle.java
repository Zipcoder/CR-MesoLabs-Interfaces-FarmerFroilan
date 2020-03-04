package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.basicactions.NoiseMaker;

public abstract class Vehicle implements Rideable, NoiseMaker {
boolean hasRider = false;

    public boolean ride() {
        if(!this.hasRider){
            this.hasRider = true;
            return true;
        }
        return false;
    }

    public boolean stopRiding() {
        if(this.hasRider){
            this.hasRider = false;
            return true;
        }
        return false;
    }

}
