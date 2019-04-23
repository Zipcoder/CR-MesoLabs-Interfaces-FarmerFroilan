package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class CornStalk extends Crop{

    protected boolean hasBeenFertilized = false;
    protected boolean hasBeenHarvested = false;

    @Override
    public Edible yield() {
        if(hasBeenFertilized && hasBeenHarvested) {
            hasBeenFertilized = false;
            hasBeenHarvested = false;
            return new EarCorn();
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
