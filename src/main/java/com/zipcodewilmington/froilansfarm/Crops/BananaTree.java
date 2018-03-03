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

    public boolean getHasBeenHarvested() {
        return this.hasBeenHarvested;
    }

    public boolean getHasBeenFertilized() {
        return this.hasBeenFertilized;
    }
}
