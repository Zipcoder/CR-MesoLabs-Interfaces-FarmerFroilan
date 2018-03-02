package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edible.Tomato;

public class TomatoPlant extends Crop{

    @Override
    public Tomato yield() {
        if (this.isHarvested && this.isFertilized) return new  Tomato();
        return null;
    }
}
