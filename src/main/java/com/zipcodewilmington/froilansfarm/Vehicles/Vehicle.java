package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable{
    public boolean mounted() {
        return false;
    }

    public boolean dismounted() {
        return false;
    }
}
