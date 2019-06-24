package com.zipcodewilmington.froilansfarm.Crops;


import com.zipcodewilmington.froilansfarm.Produce.Produce;
import com.zipcodewilmington.froilansfarm.Produce.Bounty;

public abstract class Crops extends Produce {

    protected Boolean harvested = false;

    @Override
    public Boolean hasEdible() {
        return (fertilized && !harvested);
    }

    public Boolean getHarvested() {
        return harvested;
    }

    public void setHarvested(Boolean harvested) {
        this.harvested = harvested;
    }



}
