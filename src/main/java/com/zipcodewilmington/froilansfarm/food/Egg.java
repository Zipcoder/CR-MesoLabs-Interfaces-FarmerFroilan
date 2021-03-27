package com.zipcodewilmington.froilansfarm.food;

public class Egg implements Edible {
    int egg = 1;

    public boolean wasEaten() {

        if(egg == 1)
            return false;

        return true;
    }

    public void makeEaten() {

        egg = 0;
    }
}
