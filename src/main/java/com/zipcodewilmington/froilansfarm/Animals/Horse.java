package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    private boolean isMounted = false;

    public void eat(Edible food) {
        food = null;
    }

    public String makeNoise() {
        return null;
    }

    public boolean mounted() {
        isMounted = true;
        return isMounted;
    }

    public boolean dismounted() {
        isMounted = false;
        return isMounted;
    }

}
