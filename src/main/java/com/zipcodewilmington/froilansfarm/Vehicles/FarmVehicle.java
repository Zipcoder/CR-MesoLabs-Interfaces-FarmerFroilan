package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Plants.Crop;
import com.zipcodewilmington.froilansfarm.Plants.CropRow;

public interface FarmVehicle{

    void fertilize(Crop crop);

    void fertilize(CropRow cropRow);

}
