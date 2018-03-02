package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Produce;

public abstract class Crop extends Produce {
    protected boolean isHarvested = false;

    public Crop(){}

    public void harvest(){
        this.isHarvested = true;
    }
}
