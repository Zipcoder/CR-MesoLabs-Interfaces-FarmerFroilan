package com.zipcodewilmington.froilansfarm.crop;

public abstract class Crop {
    boolean harvested;
    CarrotRoot fertilized;

    public void setHarvested(boolean harvested) {
        this.harvested = harvested;
    }

    public void setFertilized(boolean fertilized) {
        this.fertilized = fertilized;
    }
}
