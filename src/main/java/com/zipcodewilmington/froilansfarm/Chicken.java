package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;

public class Chicken extends Animal implements Produce<Egg> {
    private boolean HBF;


    public void makeNoise() {

    }

    public Egg yield() {
        return new Egg();
    }

    public void eat(Edible edible) {

    }
}
