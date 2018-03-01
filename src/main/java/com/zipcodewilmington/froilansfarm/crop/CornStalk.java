package com.zipcodewilmington.froilansfarm.crop;

public class CornStalk extends Crop{

    public EarCorn yield() {
        if (this.hasBeenFertilized && !this.hasBeenHarvested) {
            this.hasBeenHarvested = true;
            return new EarCorn();
        } else {
            return null;
        }
    }
}
