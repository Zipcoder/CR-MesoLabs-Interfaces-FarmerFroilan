package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

abstract class Crop implements Produces {

    Boolean hasBeenFertilized;

    protected Crop() {
        this.hasBeenFertilized = false;
    }

    abstract public Edibles[] yield();
}
