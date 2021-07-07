package com.zipcodewilmington.froilansfarm.Animal;



import com.zipcodewilmington.froilansfarm.Produce.*;


import java.util.ArrayList;
import java.util.List;

public class Chicken extends Produce implements Animal {

    List<Edible> foodEaten = new ArrayList<Edible>();

    public Chicken() {
    }

    public Boolean getFertilized() {
        return fertilized;
    }

    public void setFertilized(Boolean fertilized) {
        this.fertilized = fertilized;
    }

    public Egg yieldEgg() {
            return new Egg();
    }

    public void eatEdible(Edible food) {
            foodEaten.add(food);
    }

    public List<Edible> getFoodEaten() {
        return foodEaten;
    }

    public String makeNoise() {
            return "Cluck! Cluck! Cluck-a-luck!";
    }

    @Override
    public Boolean hasEdible() {
        return !fertilized;
    }

    @Override
    public Bounty yield() {
        return new Eggs();
    }


}
