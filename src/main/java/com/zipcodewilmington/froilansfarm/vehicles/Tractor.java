package com.zipcodewilmington.froilansfarm.vehicles;

public class Tractor extends Vehicle implements FarmVehicle {
    public String makeNoise() {
        return null;
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
