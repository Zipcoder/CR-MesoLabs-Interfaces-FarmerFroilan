package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Edible.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Animal;

public class Chicken extends Produce implements Animal{

    public int calories;

    public int getCalories() {
        return calories;
    }

    public Chicken(){
        this.calories = 0;
    }

    public String makeNoise() {
        return "Cheep!";
    }

    public void eat(Edible edible) {
        this.calories += edible.calories;
    }

    public Egg yield() {
        return new Egg();
    }
}
