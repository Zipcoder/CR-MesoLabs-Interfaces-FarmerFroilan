package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;

public interface Botanist extends Person {
    void plant(Crop crop, CropRow cropRow);
}
