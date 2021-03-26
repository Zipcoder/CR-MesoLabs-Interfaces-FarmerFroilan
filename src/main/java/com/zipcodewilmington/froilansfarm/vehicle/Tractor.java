package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.shelter.CropRow;
import com.zipcodewilmington.froilansfarm.shelter.FoodInventory;

public class Tractor extends Vehicle implements FarmVehicle {

    public Tractor(String name){
        super(name);
    }

    public void operate(){
        System.out.println(this.toString()+" is running!");
    }

//    public void harvest(Crop crop, FoodInventory silo){
//        silo.add(crop.harvestCrop());
//    }

    public void harvest(CropRow cropRow, FoodInventory silo){
        for(int i=0;i<cropRow.size();i++){
            if(cropRow.get(i).isFertilized() && !cropRow.get(i).isHarvested()){
                silo.add(cropRow.get(i).yield());
            }
        }
    }

    public void makeNoise() {
        System.out.println("Dumb tractor noises");
    }

    @Override
    public String toString(){
        return "Tractor";
    }
}
