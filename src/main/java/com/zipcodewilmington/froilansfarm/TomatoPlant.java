package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop {
    public TomatoPlant(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super(hasBeenFertilized, hasBeenHarvested);
    }

    Edible yield() {
        if(isHasBeenFertilized() && isHasBeenFertilized()){
            return new Tomato();
        }
        return null;
    }
}
