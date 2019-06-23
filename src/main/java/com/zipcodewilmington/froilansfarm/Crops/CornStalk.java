package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Produce.Edible;

public class CornStalk extends Crops {

    public CornStalk() {}

    @Override
    public Edible yield() {
        if(hasEdible()) return new EarOfCorn();
        return null;
    }

}
