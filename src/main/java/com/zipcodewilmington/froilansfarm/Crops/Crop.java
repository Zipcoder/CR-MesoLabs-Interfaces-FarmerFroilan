package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce;

public abstract class Crop extends Produce {
    protected boolean isHarvested = false;

    public Crop(){}

    public boolean isHarvested() {
        return isHarvested;
    }

    public void harvest(){
        this.isHarvested = true;
    }
}
