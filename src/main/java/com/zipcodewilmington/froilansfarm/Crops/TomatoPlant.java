package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Tomatoes;

public class TomatoPlant extends Crops {

    public TomatoPlant() {}

    @Override
    public Edible yield() {
        if(hasEdible()) return new Tomatoes();
        return null;
    }
}
