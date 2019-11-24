package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Eggs;

public class Chicken extends Animals {

    public Eggs layEgg(){
        Eggs egg = new Eggs();
        return egg;
    }

    public void Eat(Edibles edible) {

    }

    public String makeNoise(){
        return "Cluck cluck";
    }
}
