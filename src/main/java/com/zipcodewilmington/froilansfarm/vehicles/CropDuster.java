package com.zipcodewilmington.froilansfarm.vehicles;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {
    public String makeNoise() {
        return null;
    }

    public boolean fly() {
        return false;
    }

    public boolean operate() {
        return false;
    }

    public boolean ride() {
        return false;
    }

    public boolean stopRiding() {
        return false;
    }
}
