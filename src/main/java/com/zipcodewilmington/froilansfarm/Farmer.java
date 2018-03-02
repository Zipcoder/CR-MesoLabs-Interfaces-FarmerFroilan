package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Farmer extends Person implements Rider, Botanist {

    public Farmer(String name){
        super(name);
    }

    public String makeNoise() {
        return "Howdy";
    }

    public void eat(Edible edible) {
        this.calories += edible.calories;
    }

    public void eat(Edible... edibles){
        for (Edible edible:edibles) {
            this.eat(edible);
        }
    }

    public void mount(Rideable rideable){

    }

    public void dismount(Rideable rideable){

    }

    public void fertilize(){

    }
}
