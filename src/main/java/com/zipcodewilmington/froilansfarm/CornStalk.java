package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop {
    public CornStalk(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super(hasBeenFertilized, hasBeenHarvested);
    }

    Edible yield() {
        if(isHasBeenFertilized() && isHasBeenFertilized()) {
            return new Earcorn();
        }
        return null;
    }
}
