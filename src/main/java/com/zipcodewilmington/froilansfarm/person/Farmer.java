package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.interfaces.Ridable;
import com.zipcodewilmington.froilansfarm.shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.shelter.CropRow;
import com.zipcodewilmington.froilansfarm.shelter.FoodInventory;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

public class Farmer extends Botanist{

    public Farmer(String name){
        super(name);
    }

    public void operate(Tractor tractor, CropRow cropRow){

    }

    //Farmer goes into a chickencoop, calls yield on each chicken -> DONE
    //Currently there is no means of fertilizing chickens, so each chicken in the coop -> YIELD METHOD ALREADY CHECKS IF NOT FERTILIZED
    //should yield an egg to the FoodInventory -> DONE
    public void getEggs(ChickenCoop coop, FoodInventory silo){
        for(int i=0;i<coop.size();i++){
            silo.add(coop.get(i).yield());
        }
    }

    //Going to need to call the animal's eat method here. -> DONE
    //if not enough food, return a sad message. Something about being hungry and dolio's fault. -> ANIMALS EAT METHOD CHECKS FOR NULL FOOD
    public void feed(Animal animal, Corn food, FoodInventory silo){
        System.out.println(animal.toString()+" was fed");
        animal.eat(food,silo);
    }
}
