package com.zipcodewilmington.froilansfarm.animals.farmAnimal;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.animals.Eater;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rideable;
import com.zipcodewilmington.froilansfarm.producers.produce.ProduceInterface;

import java.util.List;

public class Horse  extends Animal implements  Rideable {

    private Integer foodEaten;
    private Boolean hasBeenRiddenToday;

    public Horse(){
        foodEaten = 0;
        hasBeenRiddenToday = false;
    }

    public void eat() {
        foodEaten++;
    }

    public String makeNoise() {

        return "Neigh!";

    }

    public void ride() {
        hasBeenRiddenToday = true;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public Boolean getHasBeenRiddenToday() {
        return hasBeenRiddenToday;
    }

    public void setHasBeenRiddenToday(Boolean hasBeenRiddenToday) {
        this.hasBeenRiddenToday = hasBeenRiddenToday;
    }
}
