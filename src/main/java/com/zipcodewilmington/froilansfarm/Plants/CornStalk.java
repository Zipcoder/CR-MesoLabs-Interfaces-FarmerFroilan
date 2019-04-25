package com.zipcodewilmington.froilansfarm.Plants;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class CornStalk extends Crop {

    public CornStalk() {}

    @Override
    public Edible yield() {
        if (fertilized) {
            return new EarCorn();
        } else {
            return null;
        }
    }

    @Override
    public boolean isFertilized() {
        return super.isFertilized();
    }

}
