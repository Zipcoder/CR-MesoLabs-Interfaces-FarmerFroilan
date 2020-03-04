package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;

public class CarrotRoot extends Crop implements Produce {


    public Boolean yield() {
        return false;
    }

    public Boolean storeFood() { return false;}
}
