package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class BananaTree extends Crop{

    protected boolean hasBeenFertilized;
    protected boolean hasBeenHarvested;

    @Override
    public Edible yield() {
        if(hasBeenFertilized && hasBeenHarvested) {
            return new Banana();
        }
        return null;
    }
}
