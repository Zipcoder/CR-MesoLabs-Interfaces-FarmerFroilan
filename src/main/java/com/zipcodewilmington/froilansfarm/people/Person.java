package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public abstract class Person implements Animal {

    public void eat(Edible food) {

    }

    public String makeNoise() {
        return null;
    }

    public void work() {

    }
}
