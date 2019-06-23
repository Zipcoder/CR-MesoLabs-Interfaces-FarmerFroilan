package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Cucumbers;
import com.zipcodewilmington.froilansfarm.Produce.Edible;

public class CucumberPlant extends Crops {

    public CucumberPlant() {}

    @Override
    public Edible yield() {
        if(hasEdible()) return new Cucumbers();
        return null;
    }
}
