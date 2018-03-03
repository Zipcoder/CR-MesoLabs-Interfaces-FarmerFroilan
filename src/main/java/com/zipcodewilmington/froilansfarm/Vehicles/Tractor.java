package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Plants.Crop;
import com.zipcodewilmington.froilansfarm.Plants.CropRow;

public class Tractor extends Vehicle implements FarmVehicle {

    public void fertilize(Crop crop) {
        if (Rideable.isMounted) {
            crop.fertilize();
        }
    }

    public void fertilize(CropRow cropRow) {
        // Can only fertilize one crop at a time
    }

    @Override
    public String makeNoise() {
        return "Awooga";
    }

}
