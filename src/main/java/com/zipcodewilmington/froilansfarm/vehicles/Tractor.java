package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.food.Crop;

public class Tractor extends Vehicle implements FarmVehicle {
    public String makeNoise() {
        return "KlunkaKlunka";
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
    public boolean harvest(Crop crop) {
        return false;
    }
}
