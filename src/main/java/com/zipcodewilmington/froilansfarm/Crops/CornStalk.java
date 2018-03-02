package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;

public class CornStalk extends Crop{

    public EarCorn yield() {
        if (this.hasBeenFertilized && !this.hasBeenHarvested) {
            this.hasBeenHarvested = true;
            return new EarCorn();
        }
        return null;
    }
}
