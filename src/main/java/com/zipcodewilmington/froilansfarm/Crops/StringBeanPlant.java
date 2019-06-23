package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.StringBeans;

public class StringBeanPlant extends Crops {

    public StringBeanPlant() {}

    @Override
    public Edible yield() {
        if(hasEdible()) return new StringBeans();
        return null;
    }

}
