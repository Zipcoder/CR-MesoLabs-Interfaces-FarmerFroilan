package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;


public class Chicken extends Animal implements Produce{

    private boolean hasBeenHarvested = false;
    private boolean hasBeenFertilized = false;


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

    public void startOfDayReset(){
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
        this.foodEaten.clear();
    }
}
