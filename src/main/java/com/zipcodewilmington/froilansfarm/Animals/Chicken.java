package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Production.Egg;

public class Chicken extends Animal implements Produce {

    private boolean hasBeenFertilized = false;


    public Chicken() {

    }

    public Egg yield() {

        return null;
    }

    public void makeNoise(){

    }

    public void eat(Edible object) {

    }

    public void setHasBeenFertilized(boolean someBoolean) {
        this.hasBeenFertilized = someBoolean;
    }

//    public boolean getHasBeenFertilized() {
//        return hasBeenFertilized;
//    }



}

