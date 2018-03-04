package com.zipcodewilmington.froilansfarm;

public abstract class Produce {

    private boolean hasBeenFertilized;

    public Produce(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    abstract Edible yield();
}
