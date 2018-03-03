package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    private boolean isMounted = false;
    private boolean dailyExercise = false;

    public void eat(Edible food) {
        food = null;
    }

    public String makeNoise() {
        return "Neigh or something";
    }

    public boolean mounted() {
        isMounted = true;
        return isMounted;
    }

    public boolean dismounted() {
        isMounted = false;
        return isMounted;
    }

    public boolean isDailyExercise() {
        return dailyExercise;
    }

    public void gallop() {
        if (isMounted) {
            this.dailyExercise = true;
        }
    }

}
