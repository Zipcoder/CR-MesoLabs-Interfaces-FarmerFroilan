package com.zipcodewilmington.froilansfarm.crop;

public class TomatoPlant extends Crop{
    public Tomato yield() {
        if (this.hasBeenFertilized && !this.hasBeenHarvested) {
            this.hasBeenHarvested = true;
            return new Tomato();
        } else {
            return null;
        }
    }
}
