package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

import java.util.ArrayList;

public class Chicken extends Animal implements Produce{

    private boolean hasBeenHarvested = false;
    private boolean hasBeenFertilized = false;


    private ArrayList<Edible> foodEaten = new ArrayList();

    public void eat(Edible food) {
        this.foodEaten.add(food);

    }

    public ArrayList<Edible> getFoodEaten() {
        return foodEaten;
    }

    public String makeNoise() {
        return "Bawk!";
    }

    public void setHasBeenHarvested(boolean harvested){
        this.hasBeenHarvested = harvested;
    }

    public boolean getHasBeenHarvested(){
        return this.hasBeenHarvested;
    }

    public void setHasBeenFertilized(boolean fertilized){
        this.hasBeenFertilized = fertilized;
    }

    public boolean getHasBeenFertilized(){
        return this.hasBeenFertilized;
    }

    public Egg yield() {
        if (!this.hasBeenHarvested && !this.hasBeenFertilized) {
            this.hasBeenHarvested = true;
            return new Egg();
        } else {
            return null;
        }
    }

    public void endOfDayReset(){
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
        this.foodEaten.clear();
    }
}
