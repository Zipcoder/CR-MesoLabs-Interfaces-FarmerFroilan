package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;

public class OnionRoot extends Crop implements Produce {

    public boolean isYield() {
        return false;
    }

    public boolean storeFood() {
        return false;
    }
}
