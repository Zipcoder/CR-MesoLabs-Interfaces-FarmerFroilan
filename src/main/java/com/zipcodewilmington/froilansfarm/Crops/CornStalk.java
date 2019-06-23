package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Produce.Edible;

public class CornStalk extends Crop {

    public CornStalk() {}

    public Edible yield() {
        if(hasEdible()) return new EarOfCorn();
        return null;
    }

}
