package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public class Animals implements NoiseMaker, Eater {
    public void Eat(Edibles edible) {

    }

    public String makeNoise() {
        return null;
    }
}
