package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public abstract class Person implements Eater, NoiseMaker, Rider{
    public void eat(Edible edible) {

    }



    public void mount() {

    }

    public void dismount() {

    }
}
