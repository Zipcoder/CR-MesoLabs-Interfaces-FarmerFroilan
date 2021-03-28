package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Noisemaker;
import com.zipcodewilmington.froilansfarm.shelter.FoodInventory;

public abstract class Animal implements Eater<Corn>, Noisemaker {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(Corn food, FoodInventory silo){
        //Will remove an instance of a Corn edible object from the given foodInventory -> DONE
        //Maybe if object doesn't exist, give a message that the animal is hungry -> DONE
        //For debugging purposes at least, print out given foodInventory ->
        if(silo.remove(food)){
            System.out.println(this.name.toString()+" ate "+food.toString());
            System.out.println("Current food in food inventory: "+silo.size());
        }
        else{
            System.out.println(this.name.toString()+" was not completely fed and is still hungry!");
        }

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
