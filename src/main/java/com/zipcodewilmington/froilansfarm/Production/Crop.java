package com.zipcodewilmington.froilansfarm.Production;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public abstract class Crop implements Produce {

    private boolean hasBeenFertilized = false;
    private boolean hasBeenHarvested = false;

    public Edible yield() {
        return null;
    }

    public void beFertilized() {
        this.hasBeenFertilized = true;
    }

    public boolean getHasBeenFertilized() {
        return this.hasBeenFertilized;
    }

    public void beHarvested() {
        this.hasBeenHarvested = true;
    }

    public boolean getHasBeenHarvested() {
        return this.hasBeenHarvested;
    }


}
