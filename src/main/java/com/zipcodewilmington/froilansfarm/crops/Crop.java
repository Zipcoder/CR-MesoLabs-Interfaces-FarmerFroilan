package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {
    boolean isFertilized = false;
    boolean isHarvested = false;

    public Crop(){

    }

    public void fertilizeCrop() {
        isFertilized = true;
    }

    public boolean isFertilized() {
        return isFertilized;
    }

    public boolean isHarvested() {
        return isHarvested;
    }


}
