package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edible.EarCorn;

public class CornStalk extends Crop{
    @Override
    public EarCorn yield() {
        if (this.isHarvested && this.isFertilized) return new EarCorn();
        return null;
    }
}
