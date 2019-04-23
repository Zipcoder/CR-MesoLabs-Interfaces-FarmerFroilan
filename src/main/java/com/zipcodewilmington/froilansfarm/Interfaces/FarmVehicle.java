package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Buildings.Farm;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;

public interface FarmVehicle {

    void operate(Farm farm);
    void fertilize(CropRow cropRow);

}
