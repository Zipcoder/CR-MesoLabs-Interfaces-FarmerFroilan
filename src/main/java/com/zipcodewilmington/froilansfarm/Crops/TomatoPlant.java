package com.zipcodewilmington.froilansfarm.Crops;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class TomatoPlant extends Crop {

    protected boolean hasBeenFertilized;
    protected boolean hasBeenHarvested;

    public Edible yield() {
        if(hasBeenFertilized && hasBeenHarvested) {
            return new Tomato();
        }
        return null;
    }

    public boolean getHasBeenHarvested() {
        return this.hasBeenHarvested;
    }

    public boolean getHasBeenFertilized() {
        return this.hasBeenFertilized;
    }
}
