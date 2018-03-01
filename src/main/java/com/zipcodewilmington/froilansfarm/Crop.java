package com.zipcodewilmington.froilansfarm;

public class Crop implements Produce {

    private boolean fertilized = false;

    public Edible yield() {
        return null;
        // Crop is generic dogg whatchu think
    }

    public boolean isFertilized() {
        return fertilized;
    }

    public boolean fertilize() {
        fertilized = true;
        return fertilized;
    }

}
