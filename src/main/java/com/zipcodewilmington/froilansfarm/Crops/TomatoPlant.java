package com.zipcodewilmington.froilansfarm.Crops;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class TomatoPlant extends Crop {

    protected boolean hasBeenFertilized;
    protected boolean hasBeenHarvested;

    public Edible yield() {
        if(hasBeenFertilized && hasBeenHarvested) {
            return new Tomato();
        }
        return null;
    }
}
