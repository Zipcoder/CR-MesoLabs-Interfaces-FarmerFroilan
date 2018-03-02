package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.Watermelon;

public class WatermelonPlant extends Crop{

    public Watermelon yield() {
        if (this.hasBeenFertilized && !this.hasBeenHarvested){
            this.hasBeenHarvested = true;
            return new Watermelon();
        }
        return null;
    }
}
