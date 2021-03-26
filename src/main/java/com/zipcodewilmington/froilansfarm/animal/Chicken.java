package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.edible.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {
    boolean isFertilized = false;

    public Chicken(String name){
        super(name);
    }

    public Egg yield(){
        if(isFertilized){
            return new Egg();
        }
        return null;
    }

    public void isFertilized(){
        isFertilized = true;
    }

    public void makeNoise() {
        System.out.println("Cock-a-doodle-doo");
    }
}
