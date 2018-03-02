package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Plants.Crop;

public class CropDuster extends AirCraft implements FarmVehicle{

    public void fertilize(Crop crop) {
        crop.fertilize();
    }

}
