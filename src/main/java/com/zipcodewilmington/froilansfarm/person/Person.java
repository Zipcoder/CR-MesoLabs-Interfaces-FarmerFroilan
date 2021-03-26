package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Noisemaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public abstract class Person implements Eater<Edible>, Noisemaker, Rider {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Hi I'm a Person");
    }

    public void eat(Edible food){
        System.out.println(name+" ate "+food);
        //INTERACT WITH INVENTORY AND DELETE FOOD
    }
}
