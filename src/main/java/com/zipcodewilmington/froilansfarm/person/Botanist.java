package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.plants.Crop;

public interface Botanist {
    void plant(Crop crop, CropRow row);
    void fertilize(Crop crop);
}
