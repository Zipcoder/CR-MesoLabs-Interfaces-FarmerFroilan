package com.zipcodewilmington.froilansfarm.crop;

public class PotatoPlant extends Crop {

    public Potato yield() {
        if (this.hasBeenFertilized && !this.hasBeenHarvested) {
            this.hasBeenHarvested = true;
            return new Potato();
        } else {
            return null;
        }
    }
}
