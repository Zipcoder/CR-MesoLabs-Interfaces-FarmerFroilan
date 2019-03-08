package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.animals.Eater;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.NoiseMaker;

import java.util.HashMap;
import java.util.List;

public class Person extends Animal {

    private String name;
    private HashMap<Edible, Integer> foodEaten;

    public Person() {
        this.foodEaten = new HashMap<Edible, Integer>();
    }


    // change
    public void eat(Edible edible) {
        Integer currentAmount = currentEatenAmount(edible);
        currentAmount++;
        foodEaten.put(edible, currentAmount);
    }

    public HashMap getFood() {
        return this.foodEaten;
    }

    public String makeNoise() {
        return "Talking Loudly";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Integer currentEatenAmount(Edible food) {
        Integer retVal = 0;
        if (foodEaten.get(food) != null) {
            retVal = foodEaten.get(food);
        }

        return retVal;

    }
}
