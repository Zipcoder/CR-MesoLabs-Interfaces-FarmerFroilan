package com.zipcodewilmington.froilansfarm.farm.things.vehicles;

import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;

public class CropDuster extends Vehicle implements FarmVehicle,Aircraft {
    public CropDuster(String name) {
        super(name);
    }

    public void fly() {

    }

    public void operate(Farm homeFarm) {

    }

    public String makeNoise() {
        return null;
    }

    public void fertilize (CropRow targetRow){

    }

    @Override
    public void getOn() {

    }

    @Override
    public void getOff() {

    }
}
