package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.shelter.CropRow;

public class Tractor extends Vehicle implements FarmVehicle {

    public Tractor(String name){
        super(name);
    }

    public void operate(CropRow cropRow){
        harvest(cropRow);
    }

    public void operate(Crop crop){
        harvest(crop);
    }

    private void harvest(Crop crop){
        crop.isHarvested();
    }

    private void harvest(CropRow cropRow){
        for(int i=0;i<cropRow.size();i++){
            cropRow.get(i).isHarvested();
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
