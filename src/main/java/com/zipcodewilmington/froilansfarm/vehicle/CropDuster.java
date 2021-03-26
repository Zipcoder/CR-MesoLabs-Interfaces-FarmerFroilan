package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.shelter.CropRow;

public class CropDuster extends Airplane implements FarmVehicle {

    public CropDuster(String name){
        super(name);
    }

    public void operate(CropRow cropRow){
        fertilize(cropRow);
    }

    private void fertilize(CropRow cropRow){
        for(int i=0;i<cropRow.size();i++){
            cropRow.get(i).isFertilized();
        }
    }

    public void makeNoise(){
        System.out.println("Stupid plane noise");
    }

    @Override
    public String toString(){
        return "Crop Duster";
    }

}
