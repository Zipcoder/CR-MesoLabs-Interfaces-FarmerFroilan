package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Plants.Crop;
import com.zipcodewilmington.froilansfarm.Plants.CropRow;

public interface Botanist {

    public void plant(Crop cropToPlant, CropRow rowToPlantIn);

    public String fertilizeOnVehicle(Crop crop);

}
