package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Tomato;

public class TomatoPlant extends Crop {

    public TomatoPlant() {}

    public Edible yield() {
        if(hasEdible()) return new Tomato();
        return null;
    }
}
