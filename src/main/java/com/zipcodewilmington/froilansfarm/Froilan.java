package com.zipcodewilmington.froilansfarm;

public class Froilan extends Farmer implements Person, Driver, NoiseMaker, Eater {
    public boolean canDrive() {
        return true;
    }

    public boolean makesNoise() {
        return true;
    }
}
