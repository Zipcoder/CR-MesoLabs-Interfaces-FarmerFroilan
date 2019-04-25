package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Egg implements Edible {

    boolean hasBeenEaten = false;

    public void getsEaten() {
        this.hasBeenEaten = true;
    }

}
