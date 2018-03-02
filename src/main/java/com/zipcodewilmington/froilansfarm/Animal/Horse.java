package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    public boolean Rideable() {
        return true;
    }

    public boolean eat() {
        return true;
    }

    public String makeNoise() {

        return "Well, I can't say the neigh-no, my brother.";
    }
}
