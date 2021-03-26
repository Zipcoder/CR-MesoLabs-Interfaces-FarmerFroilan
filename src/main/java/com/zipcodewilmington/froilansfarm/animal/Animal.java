package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Noisemaker;

public abstract class Animal implements Eater<Corn>, Noisemaker {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(Corn food){
        System.out.println(this.toString()+" ate "+food.toString());
    }


}
