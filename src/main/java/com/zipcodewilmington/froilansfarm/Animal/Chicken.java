package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Egg;
import com.zipcodewilmington.froilansfarm.Produce.Produce;

public class Chicken extends Produce implements Animal, NoiseMaker, Eater {


    public boolean makesNoise() {
        return false;
    }

    @Override
    public Boolean hasEdible() {
        return !fertilized;
    }

    @Override
    public Edible yield() {
        if (hasEdible()) return new Egg();

        return null;
    }
//    public Edible yield() {
//        if(hasEdible()) return new Egg();
//        return null;
//    }
}
