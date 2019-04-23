package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public abstract class Crop implements Produce {

    public boolean hasBeenHarvested;
    public boolean hasBeenFertilized;

    public abstract Edible yield();
}
