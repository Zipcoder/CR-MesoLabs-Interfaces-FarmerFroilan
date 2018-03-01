package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible.Edible;

public class Farmer extends Person {

    public Farmer(String name){
        super(name);
    }

    public String makeNoise() {
        return "Howdy";
    }

    public void eat(Edible edible) {

    }
}
