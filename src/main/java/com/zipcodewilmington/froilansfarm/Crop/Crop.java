package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public abstract class Crop<T> implements Produce {
    private boolean fertilized;
    private boolean harvested;

    public Crop() {
        fertilized = false;
        harvested = false;
    }

    public boolean hasBeenFertilized() {
        return fertilized;
    }

    public boolean hasBeenHarvested() {
        return harvested;
    }

    public void setFertilized() {
        fertilized = true;
    }

    public void setHarvested() {
        harvested = true;
    }
}
