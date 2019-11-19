package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Person implements NoiseMaker, Eater {

    private Pilot pilot;
    private String name;



    Person(String name) {
        this.name = name;
    }




}
