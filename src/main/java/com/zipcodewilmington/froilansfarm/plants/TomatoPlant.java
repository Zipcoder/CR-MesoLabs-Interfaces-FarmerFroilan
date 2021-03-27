package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.food.Tomato;

public class TomatoPlant extends Crop {

    public Tomato yield() {
        if(this.hasBeenFertilized()) {
            this.setHasBeenHarvested(true);
            return new Tomato();
        }

        return null;
    }
}

