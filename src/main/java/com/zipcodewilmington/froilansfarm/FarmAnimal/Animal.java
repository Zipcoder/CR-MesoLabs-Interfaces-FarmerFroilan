package com.zipcodewilmington.froilansfarm.FarmAnimal;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

import java.util.ArrayList;

public abstract class Animal implements NoiseMaker, Eater {

    ArrayList<Edible> animalStomach = new ArrayList<>();

    public void eat(Edible food) {

    }

    public String makeNoise() {
        return "Animal sounds";
    }
}
