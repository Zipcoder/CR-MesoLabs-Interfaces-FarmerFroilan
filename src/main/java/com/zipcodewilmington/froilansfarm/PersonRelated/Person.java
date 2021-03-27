package com.zipcodewilmington.froilansfarm.PersonRelated;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Meals;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

public class Person implements Eater, NoiseMaker {
    Integer meals;

    private String name;
    public void eat(Meals meals) {

    }

    public String makeNoise() {
        return "noise";
    }

    public void eat(Edible edible) {
    }


}
