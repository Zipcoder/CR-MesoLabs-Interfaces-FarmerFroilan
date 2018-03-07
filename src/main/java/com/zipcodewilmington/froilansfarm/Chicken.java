package com.zipcodewilmington.froilansfarm;

public class Chicken extends Produce implements Animal {

    public Chicken(boolean hasBeenFertilized) {
        super(hasBeenFertilized);
    }

    Edible yield() {
        if(!this.isHasBeenFertilized()) {
            return new EdibleEgg();
        }
        return null;
    }

    public void eat(Edible edible) {
        edible.eat();
    }

    public String makeNoise() {
        return "cluck";

    }



}
