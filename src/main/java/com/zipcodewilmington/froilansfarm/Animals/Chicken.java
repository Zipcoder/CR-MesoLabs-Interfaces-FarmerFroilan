package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;

public class Chicken extends Animal implements Produce{

    public ArrayList<Edible> getFoodFed() {
        return foodFed;
    }

    ArrayList<Edible> foodFed = new ArrayList<Edible>();

    boolean hasBeenFertilized;

    @Override
    public String makeNoise() {
        return "Cluck cluck";
    }

    public void eat(Edible edible) {
        foodFed.add(edible);
    }

    public EdibleEgg yield() {
        if(!this.hasBeenFertilized){
            return new EdibleEgg();
        }
        return null;
    }
}
