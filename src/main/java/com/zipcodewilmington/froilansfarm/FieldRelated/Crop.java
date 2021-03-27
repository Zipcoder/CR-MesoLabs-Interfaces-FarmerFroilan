package com.zipcodewilmington.froilansfarm.FieldRelated;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;

public class Crop {

    public String getType() {
        return this.type;
    }

    private String type;
    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;
    public Edible yield() {
        return new Edible();
    }
}




