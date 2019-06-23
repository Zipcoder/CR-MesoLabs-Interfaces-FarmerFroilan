package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.StringBeans;

public class StringBeanPlant extends Crop {

    public StringBeanPlant() {}

    public Edible yield() {
        if(hasEdible()) return new StringBeans();
        return null;
    }

}
