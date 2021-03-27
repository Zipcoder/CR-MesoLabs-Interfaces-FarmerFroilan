package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.interfaces.*;
import com.zipcodewilmington.froilansfarm.shelter.FoodInventory;

public abstract class Person implements Eater<Edible>, Noisemaker, Rider {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Hi I'm a Person");
    }

    public void eat(Edible food, FoodInventory silo){
        System.out.println(name+" ate "+food);
        //INTERACT WITH INVENTORY AND DELETE FOOD

    }

    public void mount(Ridable somethingRidable){
        System.out.print(this.getName()+" is riding "+somethingRidable.toString());
    }

    public void dismount(Ridable somethingRidable){
        System.out.print(this.getName()+" stopped riding "+somethingRidable.toString());
    }

    public String getName(){
        return name;
    }
}
