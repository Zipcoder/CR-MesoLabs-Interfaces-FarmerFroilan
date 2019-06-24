package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.StringBeans;

public class CornStalk extends Crops{

    public CornStalk() {}

    @Override
    public Edible yield() {
        if(hasEdible()) return new StringBeans();
        return null;
    }
}
