package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.interfaces.*;
import com.zipcodewilmington.froilansfarm.shelter.FoodInventory;

public abstract class Person implements Eater<Edible>, Noisemaker, Rider {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String makeNoise(){
        return "Hi I'm a Person";
    }

    public void eat(Edible food, FoodInventory silo){
        System.out.println(name+" ate "+food);
        silo.remove(food);
        //Remember to delete this line, checking the inventory is only for debugging
        System.out.println("Current food in food inventory: "+silo.size());
    }

    public void mount(Ridable somethingRidable){
        System.out.println(this.getName()+" is riding "+somethingRidable.toString());
    }

    public void dismount(Ridable somethingRidable){
        System.out.println(this.getName()+" stopped riding "+somethingRidable.toString());
    }

    public String getName(){
        return name;
    }
}
