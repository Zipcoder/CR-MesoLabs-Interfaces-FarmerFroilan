package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public abstract class Person implements NoiseMaker, Eater {
    private boolean hungry;

    public Person() {
        hungry = true;
    }

    public void makeNoise() {

    }

    public void eat(Edible food) {
        hungry = false;
    }

    public boolean isHungry() {
        return hungry;
    }
}
