package com.zipcodewilmington.froilansfarm.Production;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public abstract class Crop implements Produce {

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public Edible yield() {
        return null;
    }



}
