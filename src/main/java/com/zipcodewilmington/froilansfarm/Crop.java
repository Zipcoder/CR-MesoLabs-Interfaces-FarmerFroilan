package com.zipcodewilmington.froilansfarm;

public abstract class Crop extends Produce{

    private boolean hasBeenHarvested;

    public Crop(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super(hasBeenFertilized);
        this.hasBeenHarvested = hasBeenHarvested;
    }

    abstract Edible yield();
}
