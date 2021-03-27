package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.crops.Crop;
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

    //Farmer goes into a chickencoop, calls yield on each chicken
    //Currently there is no means of fertilizing chickens, so each chicken in the coop
    //should yield an egg to the FoodInventory
    public void getEggs(ChickenCoop coop, FoodInventory silo){
        for(int i=0;i<coop.size();i++){
            silo.add(coop.get(i).yield());
        }
    }

    //Going to need to call the animal's eat method here.
    //if not enough food, return a sad message. Something about being hungry and dolio's fault.
    public void feed(Animal animal){
        System.out.println(animal.toString()+" was fed");
    }
}
