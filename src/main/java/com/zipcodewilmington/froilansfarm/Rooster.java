package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Animal;

public class Rooster implements Animal{
    private int calories;

    public Rooster(){
        this.calories = 0;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String makeNoise() {
        return "Cock-a-doodle-doo!";
    }

    @Override
    public void eat(Edible edible) {
        this.calories += edible.calories;
    }

    public void fertilize(Chicken chicken){
        chicken.fertilize();
    }
}
