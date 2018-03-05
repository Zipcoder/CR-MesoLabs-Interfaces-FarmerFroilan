package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public abstract class Vehicle implements Rideable, NoiseMaker {

    public boolean hasFarmerRiding;

    public void setHasFarmerRiding(){
        this.hasFarmerRiding = true;
    }

    public boolean getHasFarmerRiding(){
        return hasFarmerRiding;
    }

}
