package com.zipcodewilmington.froilansfarm.Plants;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

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
