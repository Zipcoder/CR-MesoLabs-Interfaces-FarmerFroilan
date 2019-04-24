package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;

public interface Botanist {

    public void plantCrop(CropRow cropRow, Crop crop) throws IllegalAccessException, InstantiationException;
}
