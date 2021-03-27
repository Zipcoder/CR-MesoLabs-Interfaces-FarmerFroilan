package com.zipcodewilmington.froilansfarm.food;

public class Tomato implements Edible {
    int tomato = 1;

    public boolean wasEaten() {

        if(tomato == 1)
            return false;

      return true;
    }

    public void makeEaten() {

        tomato = 0;
    }

}
