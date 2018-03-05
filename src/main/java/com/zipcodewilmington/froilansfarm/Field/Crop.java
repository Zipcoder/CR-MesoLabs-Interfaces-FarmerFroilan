package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.ArrayList;

public abstract class Crop implements Produce {

    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;

    public Crop(){
        this.setHasBeenHarvested(false);
        this.setHasBeenFertilized(false);
    }

    public void setHasBeenHarvested(boolean condition){
        this.hasBeenHarvested = condition;
    }

    public void setHasBeenFertilized(boolean condition){
        this.hasBeenFertilized = condition;
    }

    public boolean getHasBeenHarvested(){
        return hasBeenHarvested;
    }

    public boolean getHasBeenFertilized(){
        return hasBeenFertilized;
    }

}
