package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public abstract class Animal implements Eater, NoiseMaker {

    public void eat(Edible food) {
        food = null;
    }

    public String makeNoise() {
        return "";
    }

}
