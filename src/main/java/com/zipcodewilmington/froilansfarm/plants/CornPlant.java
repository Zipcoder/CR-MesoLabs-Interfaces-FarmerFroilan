package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.food.Corn;

public class CornPlant extends Crop {

    public Corn yield() {

        if(this.hasBeenFertilized()) {
            this.setHasBeenHarvested(true);
            return new Corn();
        }

        return null;
    }
}
