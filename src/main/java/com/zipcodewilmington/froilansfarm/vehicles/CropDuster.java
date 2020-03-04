package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.farmland.Field;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {

    public String makeNoise() {
        return "putt putt putt putt";
    }

    public boolean fly() {
        return false;
    }

    public boolean operate(Field field) {
        return false;
    }
}
