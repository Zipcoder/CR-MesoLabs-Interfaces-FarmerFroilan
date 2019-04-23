package com.zipcodewilmington.froilansfarm.FarmAnimal;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce, Eater {

    private boolean hasBeenFertilized = false;
    private boolean hasBeenHarvested;

    @Override
    public Edible yield() {
        if(hasBeenFertilized == false) {
            return new Egg();
        }
        return null;
    }

    @Override
    public String makeNoise() {
        return "BWAAAK";
    }
}
