package com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.Produce;

public abstract class Crop implements Produce {
    private boolean fertilized;
    private boolean harvested;

    public void fertilize(){
        this.fertilized=true;
    }

    public Boolean isFertilized(){
        return this.fertilized;
    }

    public void harvest(){
        this.harvested=true;
    }

    public Boolean isHarvested(){
        return this.harvested;
    }


}
