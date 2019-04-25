package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {

    // Already inherits eat() from Animal

    private boolean fertilized = false;

    public String makeNoise() {
        return "Cluck";
    }

    public Edible yield() {
        if (fertilized) {
            fertilized = false;
            return new Egg();
        } else {
            return null;
        }
    }

    public boolean isFertilized() {
        return fertilized;
    }

    public boolean fertilize() {
        fertilized = true;
        return fertilized;
    }

}
