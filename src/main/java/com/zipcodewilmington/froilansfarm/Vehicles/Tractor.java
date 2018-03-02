package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Plants.Crop;

public class Tractor extends Vehicle implements FarmVehicle {

    // can fertilize one crop at a time
    public void fertilize(Crop crop) {
        crop.fertilize();
    }

    @Override
    public String makeNoise() {
        return "Awooga";
    }

}
