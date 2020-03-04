package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Production.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Production.Egg;

public class Chicken extends Animal implements Produce {

    private boolean hasBeenFertilized = false;


    public Chicken() {

    }

    public EdibleEgg yield() {

        if (hasBeenFertilized) {
            return new EdibleEgg();
        } else {
            return null;
        }
    }

    public void makeNoise(){
        System.out.println("cluck cluck cluck");
    }

    public void eat(Edible object) {
        System.out.println("yum");
    }

    public void fertilizeChicken() {
        this.hasBeenFertilized = true;
    }

    public boolean getHasBeenFertilizedStatus() {
        return hasBeenFertilized;
    }



}

