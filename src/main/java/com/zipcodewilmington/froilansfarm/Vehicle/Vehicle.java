package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public abstract class Vehicle implements Rideable, NoiseMaker {

    public String makeNoise() {
        return null;
    }

    public boolean isRideable() {
        return false;
    }
}
