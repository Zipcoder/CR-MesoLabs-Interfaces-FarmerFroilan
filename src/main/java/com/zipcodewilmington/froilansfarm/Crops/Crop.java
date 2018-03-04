package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public abstract class Crop implements Produce {
    boolean hasBeenHarvested;
    boolean hasBeenFertilized;

    public Crop(){
        hasBeenHarvested = false;
        hasBeenFertilized = false;
    }

    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }
    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }
    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

}
