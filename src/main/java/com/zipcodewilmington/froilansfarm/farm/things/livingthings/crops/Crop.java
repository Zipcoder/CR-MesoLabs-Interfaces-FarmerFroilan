package com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.Produce;

public abstract class Crop implements Produce {
    private boolean fertilized;
    private boolean harvested;

    public void fertilize(){

    }

    public void harvest(){

    }

    public boolean isFertilized(){
        return this.fertilized;
    }

    public boolean isHarvested(){
        return this.harvested;
    }

}
