package com.zipcodewilmington.froilansfarm;

public class Horse implements Animal, Rideable, NoiseMaker, Eater {
    public boolean makesNoise() {
        return false;
    }

    public boolean vehicleRideable() {
        return false;
    }
}
