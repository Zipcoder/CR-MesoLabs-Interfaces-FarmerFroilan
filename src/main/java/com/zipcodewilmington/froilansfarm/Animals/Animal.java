package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.LivingThing;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

public abstract class Animal implements Eater, LivingThing, NoiseMaker {
    public String eat(Edible obj) {
        return null;
    }
}
