package com.zipcodewilmington.froilansfarm;

public class Tractor implements FarmVehicle {

    //check method
    public Crop harvest(Crop crop) {
        return (Crop) crop.yield();
    }

    public void operate(Farm farm) {

    }

    public String makeNoise() {

        return null;
    }

    public void mount() {

    }

    public void dismount() {

    }
}
