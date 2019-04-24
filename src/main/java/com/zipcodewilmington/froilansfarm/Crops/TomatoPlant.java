package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.Tomato;

public class TomatoPlant extends Crop {

    public Tomato yield() {
        if (this.hasBeenFertilized && this.hasBeenHarvested){
            return new Tomato();
    }
       return null;
    }
}
