package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

import java.util.ArrayList;

public abstract class Person implements NoiseMaker, Eater {

    private String name;

    private final ArrayList<Edible> personsBelly = new ArrayList<Edible>();

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return name;
    }

    public void eat(Edible edible) {
        personsBelly.add(edible);
    }

    public ArrayList<Edible> getPersonsBelly(){
        return personsBelly;
    }

    public String makeNoise() {

        return "";
    }
}
