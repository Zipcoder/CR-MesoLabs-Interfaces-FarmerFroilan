package com.zipcodewilmington.froilansfarm.food;


public abstract class Crop implements Produce {
    Boolean hasBeenHarvested;
    Boolean hasBeenFertilized;

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public Boolean setHasBeenHarvestedTrue(Crop cropToSet){
        this.hasBeenHarvested = true;
        return cropToSet.getHasBeenHarvested();
    }

    public Boolean setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
        return getHasBeenFertilized();
    }

    public Edible harvest(Crop cropToHarvest){
        if(cropToHarvest.hasBeenFertilized && !cropToHarvest.hasBeenHarvested){
            return cropToHarvest.yield(cropToHarvest);
        }
        return null;
    }

    public abstract Edible yield(Crop crop);
}
