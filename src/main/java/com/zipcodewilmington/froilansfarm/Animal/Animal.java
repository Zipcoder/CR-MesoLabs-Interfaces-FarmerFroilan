package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public abstract class Animal implements NoiseMaker, Eater {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(Edible food) {

    }

    public void makeNoise() {
        speak();
    }

    public String getName() {
        return this.name;
    }

    abstract void speak();
}
