package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce{

    public Egg egg = new Egg();
    public EdibleEgg edibleEgg = new EdibleEgg();
    public boolean hasBeenFertilized = false;

    Chicken chicken;

    public Chicken() {
        chicken = new Chicken();
    }

    @Override
    public String makeNoise() {
        return "L'Eggo my Eggo";
    }

    @Override
    public boolean eat() {
        return true;
    }

    public Object yields() {
        if(hasBeenFertilized) {
            return egg;
        }
        return edibleEgg;
    }
}
