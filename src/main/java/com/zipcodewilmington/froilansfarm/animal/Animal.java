package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

import java.util.ArrayList;

public abstract class Animal implements NoiseMaker, Eater {
    protected ArrayList<Edible> foodEaten = new ArrayList();

    public void eat(Edible food) {
        this.foodEaten.add(food);

    }

    public ArrayList<Edible> getFoodEaten() {
        return this.foodEaten;
    }
}