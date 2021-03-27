package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.Egg;

public class Chicken extends Animal implements Producer {
    Egg egg;

    public Edible yield() {
        if (hasBeenFertilized()){
            return this.egg;
        }
        return null;
    }

    public boolean hasBeenFertilized() {

        return false;
    }

    public boolean hasBeenHarvested() {
        return false;
    }

    public String makeNoise() {
        return "cluck cluck!";
    }

    public void eat(Edible food) {
        food.makeEaten();
    }
}
