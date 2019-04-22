package com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.Produce;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Vegetable;

public class ArbitrayVegetation extends Crop {

    public Vegetable yield() {

        if (this.isFertilized() && this.isHarvested()){
            return new Vegetable();
        }

        return null;
    }
}
