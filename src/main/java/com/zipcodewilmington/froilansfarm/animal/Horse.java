package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

import java.util.ArrayList;

public class Horse extends Animal implements Rideable {
    private boolean mounted = false;
    private boolean hasBeenRidden = false;
    private ArrayList<Edible> foodEaten = new ArrayList<Edible>();

    public void eat(Edible food) {
        foodEaten.add(food);
    }

    public ArrayList<Edible> getFoodEaten() {
        return foodEaten;
    }

    public String makeNoise() {
        return "Neigh!";
    }

    public void ride() {
        this.mounted = true;
    }

    public void stopRiding() {
        this.hasBeenRidden = true;
        this.mounted = false;
    }


    public boolean getHasBeenRidden() {
        return hasBeenRidden;
    }


    public boolean getHasBeenMounted(){
        return mounted;
    }

    public void endOfDayReset(){
        this.hasBeenRidden = false;
        this.mounted = false;
        this.foodEaten.clear();
    }
}
