package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.shelter.CropRow;
import com.zipcodewilmington.froilansfarm.shelter.FoodInventory;

public class Tractor extends Vehicle implements FarmVehicle {

    public Tractor(String name){
        super(name);
    }

    //Pass farmer as parameter, print the rider's name? -> DONE
    public void operate(Farmer farmer){
        System.out.println(farmer.getName()+" is flying a "+this.toString());
    }

    //Added this one to satisfy operate() method in FarmVehicle interface
    public void operate(){
        System.out.println(this.toString()+" is running!");
    }


    public void harvest(CropRow cropRow, FoodInventory silo){
        for(int i=0;i<cropRow.size();i++){
            if(cropRow.get(i).isFertilized() && !cropRow.get(i).isHarvested()){
                silo.add(cropRow.get(i).yield());
            }
        }
    }

    public String makeNoise() {
        return "Putt putt putt Bang";
    }

    @Override
    public String toString(){
        return "Tractor";
    }
}
