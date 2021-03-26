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

    public void getEggs(ChickenCoop coop, FoodInventory silo){
        for(int i=0;i<coop.size();i++){
            silo.add(coop.get(i).yield());
        }
    }

    public void feed(Animal animal){
        System.out.println(animal.toString()+" was fed");
    }
}
