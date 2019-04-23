package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce{
    boolean hasBeenHarvested;
    boolean hasBeenFertilized;

    public boolean getHasBeenHarvested(){
        return this.hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean harvested){
        this.hasBeenHarvested = harvested;
    }

    public boolean getHasBeenFertilized(){
        return this.hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean fertilized){
        this.hasBeenFertilized = fertilized;
    }
}
