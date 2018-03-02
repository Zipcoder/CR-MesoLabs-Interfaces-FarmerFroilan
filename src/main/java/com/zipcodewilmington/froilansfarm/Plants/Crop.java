package com.zipcodewilmington.froilansfarm.Plants;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public abstract class Crop implements Produce {

    boolean fertilized = false;

    public Edible yield() {
        // What is yielded is determined by the child, not here
        fertilized = false; // This has to happen in all children
        return null; // This is obviously not the case for children, null is just here so it will compile lol
    }

    public boolean isFertilized() {
        return fertilized;
    }

    public boolean fertilize() {
        fertilized = true;
        return fertilized;
    }

}
