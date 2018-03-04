package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse implements Animal, Rideable{
    protected int calories;

    public int getCalories() {
        return calories;
    }

    public String makeNoise() {
        return "Neigh";
    }

    public void ride() {

    }

    public void eat(Edible edible) {
        this.calories += edible.calories;
    }
}
