package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.*;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class Farmer extends Person implements Botanist, Rider {
    public Farmer(String name, int startingStamina) {
        super(name, startingStamina);
    }

    public void feed(Eater eater, Edible edible) {
        eater.eat(edible);
    }

    public void plant(Crop crop, CropRow cropRow) {
        cropRow.sow(crop);
    }

    public void mount(Rideable rideable) {
        rideable.startRide(this);
    }

    public void dismount(Rideable rideable) {
        rideable.stopRide();
    }
}
