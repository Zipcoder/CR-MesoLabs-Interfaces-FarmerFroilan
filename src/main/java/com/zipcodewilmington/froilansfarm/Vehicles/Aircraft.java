package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;

public class Aircraft implements FarmVehicle, Flyable,Rideable,Driveable,Vehicle, NoiseMaker {
    public boolean isFarmVehicle() {
        return true;
    }

    public boolean canFly() {
        return true;
    }

    public boolean vehicleRideable() {
        return true;
    }

    public boolean isDriveable() {
        return true;
    }

    public boolean operate() {
        return true;
    }


    public String makeNoise() {
        return null;
    }

    public boolean makesNoise() {
        return true;
    }

    public boolean isMounted() {
        return false;
    }

    public void setMounted(boolean mounted) {

    }
}
