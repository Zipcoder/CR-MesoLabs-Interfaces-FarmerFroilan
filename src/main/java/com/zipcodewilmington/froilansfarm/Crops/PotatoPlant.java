package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edible.Potato;

public class PotatoPlant extends Crop{
    @Override
    public Potato yield() {
        if (this.isHarvested && this.isFertilized) return new Potato();
        return null;
    }
}
