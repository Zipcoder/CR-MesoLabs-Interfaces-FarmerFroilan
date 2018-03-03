package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public abstract class Person implements NoiseMaker, Eater {

    private Person person;
    private String name;

    public Person(){

    }

    public void setName(Person name){

    }

    public String getName(){
        return null;
    }

    public void eat() {

    }

    public String makeNoise() {

        return null;
    }
}
