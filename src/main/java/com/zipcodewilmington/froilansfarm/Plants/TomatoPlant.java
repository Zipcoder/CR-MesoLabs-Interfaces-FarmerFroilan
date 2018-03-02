package com.zipcodewilmington.froilansfarm.Plants;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class TomatoPlant extends Crop {

    @Override
    public Edible yield() {
        if (fertilized) {
            return new Tomato();
        } else {
            return null;
        }
    }

    @Override
    public boolean isFertilized() {
        return super.isFertilized();
    }

}
