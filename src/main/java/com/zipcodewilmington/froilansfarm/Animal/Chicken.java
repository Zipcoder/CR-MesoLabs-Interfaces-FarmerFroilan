package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {

    private boolean hasBeenFertilized;


    public void setHasBeenFertilized(boolean condition){
        this.hasBeenFertilized = condition;
    }

    public boolean getHasBeenFertilized(){
        return hasBeenFertilized;
    }

    public void eat(Edible food) {

    }

    public String makeNoise() {
        return "Cluckooo!";
    }

    public Edible yields() {
        if(!hasBeenFertilized){
            return new EdibleEgg();
        }
        return new InEdibleEgg();
    }

}
