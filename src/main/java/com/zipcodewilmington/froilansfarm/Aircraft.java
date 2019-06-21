package com.zipcodewilmington.froilansfarm;

public class Aircraft implements FarmVehicle, Flyable,Rideable,Driveable,Vehicle,NoiseMaker {
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


    public boolean makesNoise() {
        return true;
    }
}
