package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Food.Pepper;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class PepperPlant extends Crop<PepperPlant> implements Produce {
    public Pepper yield() {
        return new Pepper();
    }
}
