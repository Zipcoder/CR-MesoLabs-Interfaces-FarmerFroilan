package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {

    private boolean fertilized = false;

    public void eat(Edible food) {

    }

    public String makeNoise() {
        return "Cluck";
    }

    public Edible yield() {
        return new Egg();
    }

    public boolean isFertilized() {
        return fertilized;
    }

    public boolean fertilize() {
        fertilized = true;
        return fertilized;
    }

}
