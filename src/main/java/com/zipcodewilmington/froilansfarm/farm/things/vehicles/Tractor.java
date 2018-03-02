package com.zipcodewilmington.froilansfarm.farm.things.vehicles;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;

public class Tractor extends Vehicle implements FarmVehicle {

    public Tractor(String name) {
        super(name);
    }

    public void operate(Farm homeFarm) {

    }

    @Override
    public void shutDown(Farm homeFarm) {

    }


    public void fertilize(CropRow targetRow) {

    }


    public String makeNoise() {
        return null;
    }

    public void harvestCrop (Crop targetCrop){

    }

    @Override
    public void getOn() {

    }

    @Override
    public void getOff() {

    }
}
