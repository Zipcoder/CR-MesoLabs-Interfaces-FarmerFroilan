package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

import java.util.ArrayList;

public class Horse extends Animal implements Rideable {

    private ArrayList<Edible> horsesBelly = new ArrayList<Edible>();

    private boolean mounted;

    public void eat(Edible edible) {
        horsesBelly.add(edible);
    }

    public ArrayList<Edible> getBelly(){
        return horsesBelly;
    }

    public String makeNoise() {
        return "HeHawww!";
    }

    public void riding() {
        this.mounted = true;
    }

    public void endRiding() {
        this.mounted = false;
    }

    public boolean checkRiding(){
        return this.mounted;
    }
}
