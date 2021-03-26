package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Ridable;

public class Horse extends Animal implements Ridable {

    public Horse(String name){
        super(name);
    }


    public void makeNoise() {
        System.out.println("Nayyy");
    }
}
