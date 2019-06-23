package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Produce;

public abstract class Crop extends Produce {

    protected Boolean harvested = false;

    @Override
    public Boolean hasEdible() {
        return (fertilized && harvested);
    }

    public Boolean getHarvested() {
        return harvested;
    }

    public void setHarvested(Boolean harvested) {
        this.harvested = harvested;
    }

    abstract Edible yield();
}
