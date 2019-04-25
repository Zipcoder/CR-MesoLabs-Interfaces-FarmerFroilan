package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Plants.Crop;
import com.zipcodewilmington.froilansfarm.Plants.CropRow;

public class CropDuster extends AirCraft implements FarmVehicle{

    public void fertilize(Crop crop) {
        // Cropduster cannot precision fertilize
    }

    public void fertilize(CropRow cropRow) {
        if (Rideable.isMounted) {
            for (int i = 0; i < cropRow.getCropArrayList().size(); i++) {
                cropRow.getCropArrayList().get(i).fertilize();
            }
        }
    }

}
