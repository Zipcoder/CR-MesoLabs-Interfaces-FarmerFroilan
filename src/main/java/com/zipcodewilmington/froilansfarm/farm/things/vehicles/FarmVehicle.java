package com.zipcodewilmington.froilansfarm.farm.things.vehicles;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;

public interface FarmVehicle {
    void operate(Farm homeFarm);
    void fertilize (CropRow targetRow);
}
