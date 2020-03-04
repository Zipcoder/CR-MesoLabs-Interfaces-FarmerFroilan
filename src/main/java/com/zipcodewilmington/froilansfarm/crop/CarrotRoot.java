package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;

public class CarrotRoot extends Crop implements Produce {

    public boolean yield() {
        return false;
    }

    public boolean storeFood() {
        return false;
    }
}
