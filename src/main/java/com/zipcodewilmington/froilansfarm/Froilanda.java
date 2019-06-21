package com.zipcodewilmington.froilansfarm;

public class Froilanda extends Farmer implements Rider, Pilot, NoiseMaker, Eater {
    public boolean makesNoise() {
        return false;
    }

    public boolean canFly() {
        return false;
    }

    public boolean canMoutn() {
        return false;
    }

    public boolean canDismount() {
        return false;
    }
}
